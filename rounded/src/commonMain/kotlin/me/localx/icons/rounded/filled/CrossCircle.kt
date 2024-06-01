package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.CrossCircle: ImageVector
    get() {
        if (_crossCircle != null) {
            return _crossCircle!!
        }
        _crossCircle = Builder(name = "CrossCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 0.0f)
                    curveTo(5.3726f, 0.0f, 0.0f, 5.3726f, 0.0f, 12.0f)
                    curveTo(0.0f, 18.6274f, 5.3726f, 24.0f, 12.0f, 24.0f)
                    curveTo(18.6274f, 24.0f, 24.0f, 18.6274f, 24.0f, 12.0f)
                    curveTo(23.9928f, 5.3755f, 18.6245f, 0.0072f, 12.0f, 0.0f)
                    close()
                    moveTo(16.0f, 14.587f)
                    curveTo(16.4063f, 14.961f, 16.4326f, 15.5936f, 16.0586f, 16.0f)
                    curveTo(15.6846f, 16.4063f, 15.0519f, 16.4326f, 14.6456f, 16.0586f)
                    curveTo(14.6252f, 16.0399f, 14.6057f, 16.0203f, 14.587f, 16.0f)
                    lineTo(12.0f, 13.414f)
                    lineTo(9.414f, 16.0f)
                    curveTo(9.0167f, 16.3837f, 8.3837f, 16.3726f, 8.0f, 15.9754f)
                    curveTo(7.6258f, 15.5879f, 7.6258f, 14.9735f, 8.0f, 14.586f)
                    lineTo(10.586f, 12.0f)
                    lineTo(8.0f, 9.414f)
                    curveTo(7.6163f, 9.0167f, 7.6274f, 8.3837f, 8.0246f, 8.0f)
                    curveTo(8.4121f, 7.6258f, 9.0265f, 7.6258f, 9.414f, 8.0f)
                    lineTo(12.0f, 10.586f)
                    lineTo(14.587f, 8.0f)
                    curveTo(14.961f, 7.5937f, 15.5936f, 7.5674f, 16.0f, 7.9414f)
                    curveTo(16.4063f, 8.3154f, 16.4326f, 8.9481f, 16.0586f, 9.3544f)
                    curveTo(16.0399f, 9.3748f, 16.0203f, 9.3943f, 16.0f, 9.413f)
                    lineTo(13.414f, 12.0f)
                    lineTo(16.0f, 14.587f)
                    close()
                }
            }
        }
        .build()
        return _crossCircle!!
    }

private var _crossCircle: ImageVector? = null
