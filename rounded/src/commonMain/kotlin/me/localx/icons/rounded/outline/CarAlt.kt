package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.CarAlt: ImageVector
    get() {
        if (_carAlt != null) {
            return _carAlt!!
        }
        _carAlt = Builder(name = "CarAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 7.0f)
                reflectiveCurveToRelative(-0.584f, 0.0f, -0.625f, 0.008f)
                arcToRelative(29.709f, 29.709f, 0.0f, false, false, -2.562f, -3.959f)
                arcToRelative(3.884f, 3.884f, 0.0f, false, false, -1.978f, -1.357f)
                curveToRelative(-1.761f, -0.856f, -8.909f, -0.856f, -10.67f, 0.0f)
                arcTo(3.884f, 3.884f, 0.0f, false, false, 4.687f, 3.049f)
                arcTo(29.709f, 29.709f, 0.0f, false, false, 2.125f, 7.008f)
                curveTo(2.084f, 7.0f, 1.5f, 7.0f, 1.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 8.5f)
                lineTo(0.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 3.463f)
                lineTo(2.0f, 20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                lineTo(8.0f, 19.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                lineTo(22.0f, 18.463f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 15.0f)
                close()
                moveTo(6.274f, 4.266f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.967f, -0.659f)
                curveToRelative(1.519f, -0.751f, 8.0f, -0.751f, 9.518f, 0.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.967f, 0.659f)
                arcToRelative(28.618f, 28.618f, 0.0f, false, true, 3.72f, 6.49f)
                arcToRelative(65.424f, 65.424f, 0.0f, false, false, -18.892f, 0.0f)
                arcTo(28.618f, 28.618f, 0.0f, false, true, 6.274f, 4.266f)
                close()
                moveTo(6.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(4.0f, 19.0f)
                lineTo(6.0f, 19.0f)
                close()
                moveTo(20.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(18.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 17.0f)
                lineTo(4.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(2.0f, 12.857f)
                arcTo(75.853f, 75.853f, 0.0f, false, true, 12.0f, 12.0f)
                arcToRelative(75.853f, 75.853f, 0.0f, false, true, 10.0f, 0.857f)
                lineTo(22.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 17.0f)
                close()
                moveTo(6.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 15.0f)
                close()
                moveTo(20.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 15.0f)
                close()
            }
        }
        .build()
        return _carAlt!!
    }

private var _carAlt: ImageVector? = null
