/*
 * Copyright (c) 2015-2019 Excelsior LLC.
 *
 *  This file is part of Excelsior JET Maven Plugin.
 *
 *  Excelsior JET Maven Plugin is free software:
 *  you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Excelsior JET Maven Plugin is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Excelsior JET Maven Plugin.
 *  If not, see <http://www.gnu.org/licenses/>.
 *
*/
package com.excelsiorjet.maven.plugin;

import org.apache.maven.plugins.annotations.Execute;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;

/**
 * Mojo for performing a Test Run before building the application.
 *
 * Forks the Maven lifecycle by executing the `package` goal before calling the mojo itself.
 * That allows users to omit the (`package`) goal from the command line.
 * Use the "jet-testrun" goal ({@link TestRunMojo}) for Maven {@code <goal>} declarations.
 *
 * @author Nikita Lipsky
 */
@Execute(phase = LifecyclePhase.PACKAGE)
@Mojo(name = "testrun", defaultPhase = LifecyclePhase.PACKAGE, requiresDependencyResolution = ResolutionScope.RUNTIME)
public class CliTestRunMojo extends TestRunMojo {
}
