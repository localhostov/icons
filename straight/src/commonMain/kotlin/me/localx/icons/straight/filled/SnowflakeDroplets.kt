package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.SnowflakeDroplets: ImageVector
    get() {
        if (_snowflakeDroplets != null) {
            return _snowflakeDroplets!!
        }
        _snowflakeDroplets = Builder(name = "SnowflakeDroplets", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 17.124f)
                lineToRelative(2.931f, -1.692f)
                lineToRelative(2.277f, 1.306f)
                lineToRelative(1.485f, -1.453f)
                lineToRelative(-2.693f, -1.545f)
                verticalLineToRelative(-3.428f)
                lineToRelative(1.889f, -1.083f)
                lineToRelative(4.378f, 1.187f)
                lineToRelative(0.523f, -1.93f)
                lineToRelative(-3.812f, -1.033f)
                lineToRelative(1.034f, -3.812f)
                lineToRelative(-1.931f, -0.523f)
                lineToRelative(-1.187f, 4.378f)
                lineToRelative(-1.794f, 1.029f)
                lineToRelative(-3.1f, -1.79f)
                verticalLineToRelative(-2.075f)
                lineToRelative(3.207f, -3.207f)
                lineTo(14.793f, 0.036f)
                lineToRelative(-2.793f, 2.793f)
                lineTo(9.207f, 0.036f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(3.207f, 3.207f)
                verticalLineToRelative(2.075f)
                lineToRelative(-3.1f, 1.79f)
                lineToRelative(-1.794f, -1.029f)
                lineToRelative(-1.187f, -4.378f)
                lineToRelative(-1.931f, 0.523f)
                lineToRelative(1.034f, 3.812f)
                lineTo(0.21f, 8.485f)
                lineToRelative(0.523f, 1.93f)
                lineToRelative(4.378f, -1.187f)
                lineToRelative(1.889f, 1.083f)
                verticalLineToRelative(3.429f)
                lineToRelative(-2.693f, 1.544f)
                lineToRelative(1.485f, 1.453f)
                lineToRelative(2.277f, -1.306f)
                lineToRelative(2.93f, 1.692f)
                verticalLineToRelative(2.27f)
                lineToRelative(-3.207f, 3.207f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.793f, -2.793f)
                lineToRelative(2.793f, 2.793f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.207f, -3.207f)
                verticalLineToRelative(-2.27f)
                close()
                moveTo(23.113f, 18.871f)
                lineToRelative(-2.113f, -2.068f)
                lineToRelative(-2.121f, 2.076f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.072f, 0.0f, 4.242f)
                curveToRelative(0.566f, 0.566f, 1.32f, 0.879f, 2.121f, 0.879f)
                reflectiveCurveToRelative(1.555f, -0.312f, 2.121f, -0.879f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.072f, -0.008f, -4.25f)
                close()
                moveTo(3.0f, 16.803f)
                lineToRelative(-2.121f, 2.076f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.072f, 0.0f, 4.242f)
                curveToRelative(0.566f, 0.566f, 1.32f, 0.879f, 2.121f, 0.879f)
                reflectiveCurveToRelative(1.555f, -0.312f, 2.121f, -0.879f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.072f, -0.008f, -4.25f)
                lineToRelative(-2.113f, -2.068f)
                close()
            }
        }
        .build()
        return _snowflakeDroplets!!
    }

private var _snowflakeDroplets: ImageVector? = null
