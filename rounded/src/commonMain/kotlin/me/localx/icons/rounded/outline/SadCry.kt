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

public val Icons.Outline.SadCry: ImageVector
    get() {
        if (_sadCry != null) {
            return _sadCry!!
        }
        _sadCry = Builder(name = "SadCry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                arcToRelative(12.023f, 12.023f, 0.0f, false, true, -1.328f, 5.49f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.777f, -0.916f)
                curveTo(24.369f, 10.166f, 19.314f, 1.829f, 12.0f, 2.0f)
                curveTo(4.831f, 1.842f, -0.225f, 9.855f, 2.949f, 16.258f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.81f, 0.851f)
                curveTo(-2.669f, 9.424f, 3.4f, -0.189f, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(13.823f, 21.834f)
                arcToRelative(10.149f, 10.149f, 0.0f, false, true, -3.637f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 9.824f, 23.8f)
                arcToRelative(12.134f, 12.134f, 0.0f, false, false, 4.362f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.363f, -1.967f)
                close()
                moveTo(10.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                curveToRelative(0.0f, -1.892f, -1.232f, -4.0f, -3.0f, -4.0f)
                reflectiveCurveTo(5.0f, 9.108f, 5.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveToRelative(0.0f, -1.054f, 0.679f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.946f, 1.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 12.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveToRelative(-1.768f, 0.0f, -3.0f, 2.108f, -3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveToRelative(0.0f, -1.054f, 0.679f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.946f, 1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveTo(19.0f, 9.108f, 17.768f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(2.63f, -0.074f, 2.63f, -5.927f, 0.0f, -6.0f)
                curveTo(9.37f, 14.074f, 9.37f, 19.927f, 12.0f, 20.0f)
                close()
                moveTo(18.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(19.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 14.0f)
                close()
                moveTo(6.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(7.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 14.0f)
                close()
            }
        }
        .build()
        return _sadCry!!
    }

private var _sadCry: ImageVector? = null
