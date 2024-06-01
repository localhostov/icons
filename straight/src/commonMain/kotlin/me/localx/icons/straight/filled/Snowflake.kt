package me.localx.icons.straight.filled

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

public val Icons.Filled.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.79f, 15.5654f)
                    lineTo(19.978f, 16.6004f)
                    lineTo(21.012f, 20.4124f)
                    lineTo(19.082f, 20.9364f)
                    lineTo(17.894f, 16.5574f)
                    lineTo(15.931f, 15.4324f)
                    lineTo(13.0f, 17.1244f)
                    verticalLineTo(19.3944f)
                    lineTo(16.207f, 22.6004f)
                    lineTo(14.793f, 24.0144f)
                    lineTo(12.0f, 21.2224f)
                    lineTo(9.207f, 24.0154f)
                    lineTo(7.793f, 22.6004f)
                    lineTo(11.0f, 19.3944f)
                    verticalLineTo(17.1244f)
                    lineTo(8.069f, 15.4324f)
                    lineTo(6.106f, 16.5574f)
                    lineTo(4.918f, 20.9364f)
                    lineTo(2.988f, 20.4124f)
                    lineTo(4.022f, 16.6004f)
                    lineTo(0.21f, 15.5654f)
                    lineTo(0.733f, 13.6364f)
                    lineTo(5.111f, 14.8234f)
                    lineTo(7.0f, 13.7404f)
                    verticalLineTo(10.3124f)
                    lineTo(5.111f, 9.2284f)
                    lineTo(0.733f, 10.4154f)
                    lineTo(0.21f, 8.4854f)
                    lineTo(4.022f, 7.4524f)
                    lineTo(2.988f, 3.6404f)
                    lineTo(4.918f, 3.1164f)
                    lineTo(6.106f, 7.4944f)
                    lineTo(7.9f, 8.5234f)
                    lineTo(11.0f, 6.7334f)
                    verticalLineTo(4.6574f)
                    lineTo(7.793f, 1.4504f)
                    lineTo(9.207f, 0.0364f)
                    lineTo(12.0f, 2.8294f)
                    lineTo(14.793f, 0.0364f)
                    lineTo(16.207f, 1.4504f)
                    lineTo(13.0f, 4.6574f)
                    verticalLineTo(6.7334f)
                    lineTo(16.1f, 8.5234f)
                    lineTo(17.9f, 7.4944f)
                    lineTo(19.087f, 3.1164f)
                    lineTo(21.017f, 3.6404f)
                    lineTo(19.978f, 7.4524f)
                    lineTo(23.79f, 8.4854f)
                    lineTo(23.267f, 10.4154f)
                    lineTo(18.889f, 9.2284f)
                    lineTo(17.0f, 10.3114f)
                    verticalLineTo(13.7404f)
                    lineTo(18.889f, 14.8234f)
                    lineTo(23.267f, 13.6364f)
                    lineTo(23.79f, 15.5654f)
                    close()
                }
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
