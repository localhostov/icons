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

public val Icons.Filled.Blossom: ImageVector
    get() {
        if (_blossom != null) {
            return _blossom!!
        }
        _blossom = Builder(name = "Blossom", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                curveToRelative(0.0f, -1.657f, 3.0f, -5.0f, 3.0f, -5.0f)
                reflectiveCurveToRelative(3.0f, 3.343f, 3.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 5.0f)
                close()
                moveTo(16.185f, 7.4f)
                arcToRelative(2.938f, 2.938f, 0.0f, false, false, 4.147f, -0.6f)
                curveToRelative(0.981f, -1.326f, 0.592f, -5.8f, 0.592f, -5.8f)
                reflectiveCurveToRelative(-4.35f, 0.874f, -5.331f, 2.2f)
                arcTo(3.025f, 3.025f, 0.0f, false, false, 16.185f, 7.4f)
                close()
                moveTo(7.815f, 7.4f)
                arcToRelative(3.025f, 3.025f, 0.0f, false, false, 0.592f, -4.2f)
                curveTo(7.426f, 1.874f, 3.076f, 1.0f, 3.076f, 1.0f)
                reflectiveCurveToRelative(-0.389f, 4.474f, 0.592f, 5.8f)
                arcTo(2.938f, 2.938f, 0.0f, false, false, 7.815f, 7.4f)
                close()
                moveTo(23.687f, 10.3f)
                arcTo(2.527f, 2.527f, 0.0f, false, false, 21.48f, 9.0f)
                lineTo(2.52f, 9.0f)
                arcTo(2.525f, 2.525f, 0.0f, false, false, 0.311f, 10.309f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 0.06f, 2.468f)
                curveToRelative(2.6f, 4.136f, 10.194f, 7.274f, 10.886f, 7.223f)
                curveTo(10.807f, 19.663f, 7.0f, 16.4f, 7.0f, 13.0f)
                lineTo(9.0f, 13.0f)
                curveToRelative(0.0f, 1.708f, 1.819f, 3.67f, 3.0f, 4.708f)
                curveToRelative(1.181f, -1.038f, 3.0f, -3.0f, 3.0f, -4.708f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 3.4f, -3.807f, 6.663f, -4.257f, 7.0f)
                lineTo(11.257f, 20.0f)
                curveTo(10.369f, 20.956f, 9.0f, 22.648f, 9.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, -1.406f, -3.0f)
                lineTo(16.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineToRelative(-0.867f)
                curveToRelative(2.649f, -1.216f, 6.766f, -3.45f, 8.5f, -6.227f)
                horizontalLineToRelative(0.0f)
                arcTo(2.4f, 2.4f, 0.0f, false, false, 23.687f, 10.305f)
                close()
            }
        }
        .build()
        return _blossom!!
    }

private var _blossom: ImageVector? = null
