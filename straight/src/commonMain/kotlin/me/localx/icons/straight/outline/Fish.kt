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

public val Icons.Outline.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 19.0f)
                close()
                moveTo(24.0f, 7.0f)
                arcToRelative(1.866f, 1.866f, 0.0f, false, true, -1.9f, 2.0f)
                horizontalLineTo(16.981f)
                curveToRelative(-0.019f, 1.063f, -0.061f, 2.071f, -0.143f, 3.0f)
                horizontalLineToRelative(3.2f)
                lineToRelative(0.0f, 1.0f)
                arcToRelative(15.547f, 15.547f, 0.0f, false, true, -0.29f, 3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.455f, 2.0f)
                horizontalLineTo(15.439f)
                curveTo(13.388f, 22.465f, 9.064f, 24.0f, 1.0f, 24.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(23.0f)
                curveToRelative(0.0f, -4.884f, 0.57f, -8.385f, 2.0f, -10.856f)
                verticalLineTo(8.44f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.622f, 5.775f)
                arcTo(16.017f, 16.017f, 0.0f, false, true, 11.0f, 3.962f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.2f)
                curveToRelative(0.929f, -0.082f, 1.937f, -0.124f, 3.0f, -0.143f)
                verticalLineTo(1.9f)
                curveToRelative(0.3f, -3.392f, 5.372f, -1.818f, 5.905f, 1.2f)
                arcTo(4.079f, 4.079f, 0.0f, false, true, 24.0f, 7.0f)
                close()
                moveTo(4.0f, 8.44f)
                verticalLineTo(9.788f)
                arcTo(12.382f, 12.382f, 0.0f, false, true, 10.0f, 7.4f)
                verticalLineTo(6.0f)
                arcTo(14.292f, 14.292f, 0.0f, false, false, 4.548f, 7.547f)
                arcTo(1.009f, 1.009f, 0.0f, false, false, 4.0f, 8.44f)
                close()
                moveTo(2.008f, 21.992f)
                arcToRelative(24.919f, 24.919f, 0.0f, false, false, 6.761f, -0.838f)
                arcToRelative(8.034f, 8.034f, 0.0f, false, false, -5.924f, -5.919f)
                arcTo(24.942f, 24.942f, 0.0f, false, false, 2.008f, 21.992f)
                close()
                moveTo(14.992f, 9.008f)
                curveToRelative(-6.216f, 0.1f, -9.635f, 1.188f, -11.386f, 4.366f)
                arcToRelative(10.048f, 10.048f, 0.0f, false, true, 7.021f, 7.019f)
                curveTo(13.8f, 18.643f, 14.892f, 15.224f, 14.992f, 9.008f)
                close()
                moveTo(16.6f, 14.0f)
                arcToRelative(18.914f, 18.914f, 0.0f, false, true, -0.434f, 2.0f)
                horizontalLineToRelative(1.128f)
                arcToRelative(0.494f, 0.494f, 0.0f, false, false, 0.492f, -0.388f)
                arcTo(13.617f, 13.617f, 0.0f, false, false, 18.0f, 14.0f)
                close()
                moveTo(22.0f, 7.0f)
                arcToRelative(2.054f, 2.054f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                arcToRelative(2.05f, 2.05f, 0.0f, false, false, -2.0f, -2.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
