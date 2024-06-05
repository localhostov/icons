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

public val Icons.Filled.Volcano: ImageVector
    get() {
        if (_volcano != null) {
            return _volcano!!
        }
        _volcano = Builder(name = "Volcano", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.16f, 14.0f)
                lineToRelative(2.869f, -4.0f)
                horizontalLineToRelative(5.942f)
                lineToRelative(2.868f, 4.0f)
                horizontalLineTo(16.0f)
                arcToRelative(2.987f, 2.987f, 0.0f, false, false, -2.0f, 0.766f)
                arcToRelative(3.026f, 3.026f, 0.0f, false, false, -4.0f, 0.0f)
                arcTo(2.987f, 2.987f, 0.0f, false, false, 8.0f, 14.0f)
                close()
                moveTo(16.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(4.726f)
                lineTo(0.0f, 22.678f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(22.59f)
                lineTo(19.274f, 16.0f)
                close()
                moveTo(19.659f, 3.016f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -4.676f, -1.657f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.966f, 0.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 4.341f, 3.016f)
                curveToRelative(-4.182f, 0.57f, -2.127f, 6.633f, 1.537f, 4.568f)
                curveTo(6.893f, 8.292f, 10.4f, 7.911f, 11.0f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.619f, -0.09f, 4.094f, 0.293f, 5.122f, -0.416f)
                curveTo(21.79f, 9.649f, 23.838f, 3.583f, 19.659f, 3.016f)
                close()
            }
        }
        .build()
        return _volcano!!
    }

private var _volcano: ImageVector? = null
