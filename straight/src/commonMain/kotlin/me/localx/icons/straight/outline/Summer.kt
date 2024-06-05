package me.localx.icons.straight.outline

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

public val Icons.Outline.Summer: ImageVector
    get() {
        if (_summer != null) {
            return _summer!!
        }
        _summer = Builder(name = "Summer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.184f)
                lineTo(18.0f, 8.0f)
                lineTo(16.0f, 8.0f)
                verticalLineToRelative(6.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 2.0f, 0.0f)
                close()
                moveTo(17.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 18.0f)
                close()
                moveTo(22.0f, 12.111f)
                lineTo(22.0f, 5.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 5.0f)
                verticalLineToRelative(7.111f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 10.0f, 0.0f)
                close()
                moveTo(17.0f, 22.0f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, true, -3.332f, -8.719f)
                lineToRelative(0.332f, -0.3f)
                lineTo(14.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                verticalLineToRelative(7.983f)
                lineToRelative(0.332f, 0.3f)
                arcTo(4.994f, 4.994f, 0.0f, false, true, 17.0f, 22.0f)
                close()
                moveTo(5.0f, 9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.937f, 4.0f)
                arcToRelative(8.956f, 8.956f, 0.0f, false, false, -0.7f, 1.952f)
                arcTo(5.893f, 5.893f, 0.0f, false, true, 6.9f, 14.6f)
                lineTo(5.336f, 17.279f)
                lineTo(3.607f, 16.273f)
                lineTo(5.165f, 13.6f)
                arcToRelative(5.963f, 5.963f, 0.0f, false, true, -0.761f, -0.763f)
                lineTo(1.735f, 14.386f)
                lineTo(0.729f, 12.657f)
                lineTo(3.388f, 11.11f)
                arcTo(5.966f, 5.966f, 0.0f, false, true, 3.093f, 10.0f)
                lineTo(0.0f, 10.0f)
                lineTo(0.0f, 8.0f)
                lineTo(3.091f, 8.0f)
                arcToRelative(5.951f, 5.951f, 0.0f, false, true, 0.3f, -1.118f)
                lineTo(0.725f, 5.333f)
                lineToRelative(1.0f, -1.729f)
                lineTo(4.4f, 5.159f)
                arcToRelative(5.989f, 5.989f, 0.0f, false, true, 0.774f, -0.778f)
                lineTo(3.629f, 1.722f)
                lineTo(5.357f, 0.716f)
                lineTo(6.908f, 3.382f)
                arcTo(5.968f, 5.968f, 0.0f, false, true, 8.0f, 3.083f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 5.0f, 9.0f)
                close()
            }
        }
        .build()
        return _summer!!
    }

private var _summer: ImageVector? = null
