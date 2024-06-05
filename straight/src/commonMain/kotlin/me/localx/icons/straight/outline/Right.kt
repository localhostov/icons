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

public val Icons.Outline.Right: ImageVector
    get() {
        if (_right != null) {
            return _right!!
        }
        _right = Builder(name = "Right", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 23.94f)
                verticalLineToRelative(-6.93f)
                horizontalLineTo(0.0f)
                verticalLineTo(7.01f)
                horizontalLineTo(13.0f)
                verticalLineTo(0.06f)
                lineToRelative(10.11f, 9.82f)
                curveToRelative(0.58f, 0.58f, 0.89f, 1.33f, 0.89f, 2.13f)
                reflectiveCurveToRelative(-0.31f, 1.56f, -0.88f, 2.13f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-10.11f, 9.8f, -10.11f, 9.8f)
                close()
                moveTo(2.0f, 15.01f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(4.21f)
                lineToRelative(6.71f, -6.5f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                reflectiveCurveToRelative(-0.1f, -0.52f, -0.29f, -0.71f)
                lineToRelative(-6.71f, -6.51f)
                verticalLineToRelative(4.22f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _right!!
    }

private var _right: ImageVector? = null
