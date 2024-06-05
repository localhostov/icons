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

public val Icons.Outline.Lasso: ImageVector
    get() {
        if (_lasso != null) {
            return _lasso!!
        }
        _lasso = Builder(name = "Lasso", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 0.0f)
                curveToRelative(-6.065f, 0.0f, -11.0f, 4.037f, -11.0f, 9.0f)
                arcToRelative(7.587f, 7.587f, 0.0f, false, false, 0.692f, 3.1f)
                arcToRelative(2.936f, 2.936f, 0.0f, false, false, -0.442f, 3.079f)
                arcToRelative(6.987f, 6.987f, 0.0f, false, false, -2.25f, 4.821f)
                arcToRelative(3.888f, 3.888f, 0.0f, false, false, 4.0f, 4.0f)
                lineToRelative(0.008f, -2.0f)
                arcToRelative(1.885f, 1.885f, 0.0f, false, true, -2.008f, -2.0f)
                arcToRelative(5.059f, 5.059f, 0.0f, false, true, 1.684f, -3.426f)
                arcToRelative(10.821f, 10.821f, 0.0f, false, false, 3.429f, 0.435f)
                curveToRelative(0.3f, 0.0f, 0.577f, -0.007f, 0.843f, -0.016f)
                arcToRelative(13.048f, 13.048f, 0.0f, false, false, 5.044f, 1.007f)
                curveToRelative(6.065f, 0.0f, 11.0f, -4.037f, 11.0f, -9.0f)
                reflectiveCurveToRelative(-4.935f, -9.0f, -11.0f, -9.0f)
                close()
                moveTo(4.29f, 14.688f)
                arcToRelative(0.986f, 0.986f, 0.0f, false, true, 0.0f, -1.4f)
                arcToRelative(0.985f, 0.985f, 0.0f, false, true, 1.4f, 0.0f)
                arcToRelative(8.432f, 8.432f, 0.0f, false, true, 1.047f, 1.712f)
                arcToRelative(7.448f, 7.448f, 0.0f, false, true, -2.447f, -0.312f)
                close()
                moveTo(13.0f, 16.0f)
                arcToRelative(11.119f, 11.119f, 0.0f, false, true, -3.907f, -0.712f)
                arcToRelative(14.454f, 14.454f, 0.0f, false, false, -1.993f, -3.412f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, false, -2.678f, -0.8f)
                arcToRelative(5.581f, 5.581f, 0.0f, false, true, -0.422f, -2.076f)
                curveToRelative(0.0f, -3.859f, 4.037f, -7.0f, 9.0f, -7.0f)
                reflectiveCurveToRelative(9.0f, 3.141f, 9.0f, 7.0f)
                reflectiveCurveToRelative(-4.037f, 7.0f, -9.0f, 7.0f)
                close()
            }
        }
        .build()
        return _lasso!!
    }

private var _lasso: ImageVector? = null
