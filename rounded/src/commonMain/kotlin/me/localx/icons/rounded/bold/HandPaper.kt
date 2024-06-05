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

public val Icons.Bold.HandPaper: ImageVector
    get() {
        if (_handPaper != null) {
            return _handPaper!!
        }
        _handPaper = Builder(name = "HandPaper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 9.5f)
                lineTo(16.0f, 1.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                close()
                moveTo(12.5f, 11.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                lineTo(14.0f, 1.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(22.5f, 2.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 3.033f, -2.467f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-1.984f)
                curveToRelative(-2.374f, 0.0f, -4.678f, -0.812f, -6.523f, -2.266f)
                curveToRelative(0.019f, -0.008f, 0.039f, -0.016f, 0.058f, -0.023f)
                curveToRelative(1.184f, -0.49f, 1.949f, -1.635f, 1.949f, -2.917f)
                lineTo(9.0f, 3.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(12.294f)
                curveToRelative(0.0f, 0.039f, 0.0f, 0.104f, -0.097f, 0.145f)
                curveToRelative(-0.096f, 0.041f, -0.142f, -0.006f, -0.167f, -0.03f)
                curveToRelative(0.0f, 0.0f, -2.483f, -2.491f, -2.562f, -2.545f)
                curveToRelative(-0.7f, -0.479f, -1.817f, -0.556f, -2.593f, 0.223f)
                curveToRelative(-0.802f, 0.8f, -0.69f, 1.938f, -0.166f, 2.649f)
                curveToRelative(0.034f, 0.046f, 3.197f, 3.45f, 3.197f, 3.45f)
                curveToRelative(2.55f, 2.741f, 6.159f, 4.313f, 9.903f, 4.313f)
                horizontalLineToRelative(1.984f)
                curveToRelative(4.687f, 0.0f, 8.5f, -3.813f, 8.5f, -8.5f)
                lineTo(23.999f, 3.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _handPaper!!
    }

private var _handPaper: ImageVector? = null
