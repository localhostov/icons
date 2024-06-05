package me.localx.icons.rounded.bold

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

public val Icons.Bold.CandleHolder: ImageVector
    get() {
        if (_candleHolder != null) {
            return _candleHolder!!
        }
        _candleHolder = Builder(name = "CandleHolder", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.588f, 3.588f)
                curveToRelative(0.0f, -0.659f, 0.59f, -1.845f, 1.186f, -2.877f)
                curveToRelative(0.548f, -0.948f, 1.905f, -0.948f, 2.453f, 0.0f)
                curveToRelative(0.596f, 1.032f, 1.186f, 2.218f, 1.186f, 2.877f)
                curveToRelative(0.0f, 1.332f, -1.08f, 2.412f, -2.412f, 2.412f)
                reflectiveCurveToRelative(-2.412f, -1.08f, -2.412f, -2.412f)
                close()
                moveTo(24.0f, 19.5f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                lineTo(1.5f, 24.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.37f, 0.0f, -0.725f, 0.136f, -1.0f, 0.382f)
                curveToRelative(-0.617f, 0.553f, -1.566f, 0.5f, -2.118f, -0.117f)
                curveToRelative(-0.553f, -0.617f, -0.5f, -1.565f, 0.117f, -2.118f)
                curveToRelative(0.826f, -0.739f, 1.892f, -1.146f, 3.0f, -1.146f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
                moveTo(5.0f, 21.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                close()
            }
        }
        .build()
        return _candleHolder!!
    }

private var _candleHolder: ImageVector? = null
