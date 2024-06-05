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

public val Icons.Bold.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.136f, 13.153f)
                lineTo(18.96f, 14.286f)
                lineTo(17.0f, 13.163f)
                verticalLineTo(10.888f)
                lineToRelative(1.957f, -1.122f)
                lineTo(23.136f, 10.9f)
                lineTo(23.921f, 8.0f)
                lineToRelative(-3.329f, -0.9f)
                lineToRelative(0.9f, -3.329f)
                lineTo(18.6f, 2.985f)
                lineTo(17.466f, 7.163f)
                lineTo(15.6f, 8.233f)
                lineTo(13.5f, 7.02f)
                verticalLineToRelative(-1.8f)
                lineToRelative(3.061f, -3.061f)
                lineTo(14.439f, 0.042f)
                lineTo(12.0f, 2.481f)
                lineTo(9.561f, 0.042f)
                lineTo(7.439f, 2.163f)
                lineTo(10.5f, 5.224f)
                verticalLineToRelative(1.8f)
                lineTo(8.4f, 8.233f)
                lineTo(6.534f, 7.164f)
                lineTo(5.4f, 2.985f)
                lineToRelative(-2.894f, 0.786f)
                lineToRelative(0.9f, 3.329f)
                lineTo(0.079f, 8.0f)
                lineToRelative(0.785f, 2.9f)
                lineTo(5.043f, 9.766f)
                lineTo(7.0f, 10.888f)
                verticalLineToRelative(2.275f)
                lineTo(5.041f, 14.286f)
                lineTo(0.864f, 13.153f)
                lineTo(0.079f, 16.048f)
                lineToRelative(3.329f, 0.9f)
                lineToRelative(-0.9f, 3.33f)
                lineToRelative(2.894f, 0.785f)
                lineToRelative(1.134f, -4.177f)
                lineTo(8.57f, 15.722f)
                lineToRelative(1.93f, 1.114f)
                verticalLineToRelative(1.94f)
                lineTo(7.439f, 21.837f)
                lineToRelative(2.122f, 2.121f)
                lineTo(12.0f, 21.519f)
                lineToRelative(2.439f, 2.439f)
                lineToRelative(2.122f, -2.121f)
                lineTo(13.5f, 18.776f)
                verticalLineToRelative(-1.94f)
                lineToRelative(1.93f, -1.114f)
                lineToRelative(2.036f, 1.167f)
                lineTo(18.6f, 21.066f)
                lineToRelative(2.894f, -0.785f)
                lineToRelative(-0.9f, -3.33f)
                lineToRelative(3.329f, -0.9f)
                close()
                moveTo(14.0f, 13.083f)
                lineToRelative(-2.0f, 1.154f)
                lineToRelative(-2.0f, -1.154f)
                verticalLineToRelative(-2.31f)
                lineToRelative(2.0f, -1.154f)
                lineToRelative(2.0f, 1.154f)
                close()
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
