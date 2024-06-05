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

public val Icons.Filled.FireSmoke: ImageVector
    get() {
        if (_fireSmoke != null) {
            return _fireSmoke!!
        }
        _fireSmoke = Builder(name = "FireSmoke", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 24.0f)
                horizontalLineTo(4.5f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                curveToRelative(0.0f, -2.249f, 1.612f, -4.09f, 3.771f, -4.435f)
                curveToRelative(1.055f, -1.88f, 3.047f, -3.065f, 5.229f, -3.065f)
                curveToRelative(1.058f, 0.0f, 2.083f, 0.282f, 3.0f, 0.821f)
                curveToRelative(0.917f, -0.539f, 1.942f, -0.821f, 3.0f, -0.821f)
                curveToRelative(2.182f, 0.0f, 4.174f, 1.186f, 5.229f, 3.065f)
                curveToRelative(2.158f, 0.345f, 3.771f, 2.186f, 3.771f, 4.435f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(9.0f, 10.0f)
                curveToRelative(1.028f, 0.0f, 2.048f, 0.204f, 3.0f, 0.594f)
                curveToRelative(0.952f, -0.391f, 1.972f, -0.594f, 3.0f, -0.594f)
                curveToRelative(1.319f, 0.0f, 2.591f, 0.331f, 3.72f, 0.926f)
                curveToRelative(0.178f, -0.618f, 0.279f, -1.269f, 0.279f, -1.944f)
                curveToRelative(-0.009f, -4.167f, -3.895f, -6.939f, -4.675f, -7.453f)
                lineToRelative(-2.325f, -1.53f)
                reflectiveCurveToRelative(-1.0f, 1.284f, -1.0f, 2.284f)
                curveToRelative(0.0f, 1.5f, 1.0f, 1.954f, 1.0f, 2.954f)
                curveToRelative(0.0f, 0.828f, -0.462f, 1.75f, -1.741f, 1.75f)
                reflectiveCurveToRelative(-1.759f, -0.922f, -1.759f, -1.75f)
                curveToRelative(0.0f, -1.0f, 1.0f, -2.75f, 1.0f, -2.75f)
                curveToRelative(0.0f, 0.0f, -4.5f, 1.52f, -4.5f, 6.499f)
                curveToRelative(0.0f, 0.673f, 0.101f, 1.323f, 0.278f, 1.94f)
                curveToRelative(1.13f, -0.596f, 2.402f, -0.927f, 3.722f, -0.927f)
                close()
            }
        }
        .build()
        return _fireSmoke!!
    }

private var _fireSmoke: ImageVector? = null
