package me.localx.icons.straight.bold

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

public val Icons.Bold.SnowflakeDroplets: ImageVector
    get() {
        if (_snowflakeDroplets != null) {
            return _snowflakeDroplets!!
        }
        _snowflakeDroplets = Builder(name = "SnowflakeDroplets", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.121f, 18.879f)
                curveToRelative(1.172f, 1.172f, 1.172f, 3.071f, 0.0f, 4.243f)
                curveToRelative(-0.586f, 0.586f, -1.354f, 0.879f, -2.121f, 0.879f)
                curveToRelative(-0.768f, 0.0f, -1.535f, -0.293f, -2.121f, -0.879f)
                curveToRelative(-1.172f, -1.172f, -1.172f, -3.071f, 0.0f, -4.243f)
                lineToRelative(2.121f, -2.075f)
                lineToRelative(2.121f, 2.075f)
                close()
                moveTo(23.121f, 18.879f)
                lineToRelative(-2.121f, -2.075f)
                lineToRelative(-2.121f, 2.075f)
                curveToRelative(-1.172f, 1.172f, -1.172f, 3.071f, 0.0f, 4.243f)
                curveToRelative(0.586f, 0.586f, 1.354f, 0.879f, 2.121f, 0.879f)
                curveToRelative(0.768f, 0.0f, 1.535f, -0.293f, 2.121f, -0.879f)
                curveToRelative(1.172f, -1.172f, 1.172f, -3.071f, 0.0f, -4.243f)
                close()
                moveTo(13.5f, 16.836f)
                lineToRelative(1.93f, -1.115f)
                lineToRelative(2.406f, 1.379f)
                lineToRelative(2.229f, -2.181f)
                lineToRelative(-3.065f, -1.758f)
                verticalLineToRelative(-2.275f)
                lineToRelative(1.957f, -1.122f)
                lineToRelative(4.179f, 1.133f)
                lineToRelative(0.785f, -2.896f)
                lineToRelative(-3.33f, -0.902f)
                lineToRelative(0.903f, -3.329f)
                lineToRelative(-2.896f, -0.785f)
                lineToRelative(-1.133f, 4.178f)
                lineToRelative(-1.866f, 1.07f)
                lineToRelative(-2.101f, -1.213f)
                verticalLineToRelative(-1.797f)
                lineToRelative(3.061f, -3.061f)
                lineTo(14.439f, 0.042f)
                lineToRelative(-2.439f, 2.439f)
                lineTo(9.561f, 0.042f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(3.061f, 3.061f)
                verticalLineToRelative(1.797f)
                lineToRelative(-2.101f, 1.213f)
                lineToRelative(-1.865f, -1.07f)
                lineToRelative(-1.133f, -4.178f)
                lineToRelative(-2.896f, 0.785f)
                lineToRelative(0.903f, 3.329f)
                lineTo(0.079f, 8.002f)
                lineToRelative(0.785f, 2.896f)
                lineToRelative(4.179f, -1.133f)
                lineToRelative(1.957f, 1.122f)
                verticalLineToRelative(2.275f)
                lineToRelative(-3.065f, 1.758f)
                lineToRelative(2.229f, 2.181f)
                lineToRelative(2.406f, -1.379f)
                lineToRelative(1.93f, 1.115f)
                verticalLineToRelative(1.94f)
                lineToRelative(-3.061f, 3.061f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(2.439f, -2.439f)
                lineToRelative(2.439f, 2.439f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-3.061f, -3.061f)
                verticalLineToRelative(-1.94f)
                close()
                moveTo(10.0f, 13.083f)
                verticalLineToRelative(-2.31f)
                lineToRelative(2.0f, -1.154f)
                lineToRelative(2.0f, 1.154f)
                verticalLineToRelative(2.31f)
                lineToRelative(-2.0f, 1.154f)
                lineToRelative(-2.0f, -1.154f)
                close()
            }
        }
        .build()
        return _snowflakeDroplets!!
    }

private var _snowflakeDroplets: ImageVector? = null
