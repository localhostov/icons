package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.Fill: ImageVector
    get() {
        if (_fill != null) {
            return _fill!!
        }
        _fill = Builder(name = "Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.613f, 15.0282f)
                    lineTo(24.028f, 13.6132f)
                    lineTo(10.419f, 0.0052f)
                    lineTo(9.005f, 1.4193f)
                    lineTo(10.136f, 2.5503f)
                    lineTo(8.588f, 4.1002f)
                    lineTo(5.74f, 1.2162f)
                    lineTo(4.318f, 2.6223f)
                    lineTo(7.174f, 5.5122f)
                    lineTo(0.879f, 11.8122f)
                    curveTo(0.3166f, 12.3748f, 6.0E-4f, 13.1377f, 6.0E-4f, 13.9332f)
                    curveTo(6.0E-4f, 14.7287f, 0.3166f, 15.4916f, 0.879f, 16.0542f)
                    lineTo(7.949f, 23.1252f)
                    curveTo(8.2275f, 23.4039f, 8.5583f, 23.6249f, 8.9223f, 23.7757f)
                    curveTo(9.2863f, 23.9265f, 9.6765f, 24.0041f, 10.0705f, 24.0041f)
                    curveTo(10.4645f, 24.0041f, 10.8546f, 23.9265f, 11.2186f, 23.7757f)
                    curveTo(11.5826f, 23.6249f, 11.9134f, 23.4039f, 12.192f, 23.1252f)
                    lineTo(21.45f, 13.8682f)
                    lineTo(22.613f, 15.0282f)
                    close()
                    moveTo(10.778f, 21.7072f)
                    curveTo(10.5877f, 21.8895f, 10.3344f, 21.9912f, 10.071f, 21.9912f)
                    curveTo(9.8075f, 21.9912f, 9.5542f, 21.8895f, 9.364f, 21.7072f)
                    lineTo(2.293f, 14.6362f)
                    curveTo(2.1055f, 14.4487f, 2.0002f, 14.1944f, 2.0002f, 13.9292f)
                    curveTo(2.0002f, 13.6641f, 2.1055f, 13.4098f, 2.293f, 13.2222f)
                    lineTo(8.58f, 6.9352f)
                    lineTo(13.289f, 11.7002f)
                    lineTo(14.711f, 10.3002f)
                    lineTo(9.993f, 5.5222f)
                    lineTo(11.55f, 3.9642f)
                    lineTo(20.036f, 12.4502f)
                    lineTo(10.778f, 21.7072f)
                    close()
                    moveTo(21.5f, 17.0002f)
                    curveTo(21.5f, 17.0002f, 24.0f, 20.1192f, 24.0f, 21.5002f)
                    curveTo(24.0f, 22.1633f, 23.7366f, 22.7991f, 23.2677f, 23.268f)
                    curveTo(22.7989f, 23.7368f, 22.163f, 24.0002f, 21.5f, 24.0002f)
                    curveTo(20.8369f, 24.0002f, 20.201f, 23.7368f, 19.7322f, 23.268f)
                    curveTo(19.2634f, 22.7991f, 19.0f, 22.1633f, 19.0f, 21.5002f)
                    curveTo(19.0f, 20.2502f, 21.5f, 17.0002f, 21.5f, 17.0002f)
                    close()
                }
            }
        }
        .build()
        return _fill!!
    }

private var _fill: ImageVector? = null
