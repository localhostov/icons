package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.172f, 19.1186f)
                    curveTo(0.4218f, 19.8686f, 2.0E-4f, 20.8858f, 0.0f, 21.9466f)
                    lineTo(0.0f, 23.9996f)
                    horizontalLineTo(2.053f)
                    curveTo(3.1138f, 23.9994f, 4.131f, 23.5778f, 4.881f, 22.8276f)
                    lineTo(18.224f, 9.4846f)
                    lineTo(14.515f, 5.7756f)
                    lineTo(1.172f, 19.1186f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.1448f, 0.8552f)
                    curveTo(22.9013f, 0.6114f, 22.6122f, 0.418f, 22.2939f, 0.2861f)
                    curveTo(21.9756f, 0.1542f, 21.6344f, 0.0862f, 21.2898f, 0.0862f)
                    curveTo(20.9453f, 0.0862f, 20.6041f, 0.1542f, 20.2858f, 0.2861f)
                    curveTo(19.9675f, 0.418f, 19.6783f, 0.6114f, 19.4348f, 0.8552f)
                    lineTo(15.9288f, 4.3622f)
                    lineTo(19.6378f, 8.0712f)
                    lineTo(23.1448f, 4.5652f)
                    curveTo(23.3886f, 4.3217f, 23.582f, 4.0325f, 23.7139f, 3.7142f)
                    curveTo(23.8459f, 3.3959f, 23.9138f, 3.0547f, 23.9138f, 2.7102f)
                    curveTo(23.9138f, 2.3656f, 23.8459f, 2.0244f, 23.7139f, 1.7062f)
                    curveTo(23.582f, 1.3879f, 23.3886f, 1.0987f, 23.1448f, 0.8552f)
                    close()
                }
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
