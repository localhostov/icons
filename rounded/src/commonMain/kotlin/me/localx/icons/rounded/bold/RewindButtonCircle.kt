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

public val Icons.Bold.RewindButtonCircle: ImageVector
    get() {
        if (_rewindButtonCircle != null) {
            return _rewindButtonCircle!!
        }
        _rewindButtonCircle = Builder(name = "RewindButtonCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(16.955f, 8.496f)
                verticalLineToRelative(7.008f)
                curveToRelative(0.0f, 0.817f, -0.931f, 1.285f, -1.587f, 0.798f)
                lineToRelative(-3.368f, -2.5f)
                verticalLineToRelative(1.701f)
                curveToRelative(0.0f, 0.817f, -0.931f, 1.285f, -1.587f, 0.798f)
                lineToRelative(-4.721f, -3.504f)
                curveToRelative(-0.536f, -0.398f, -0.536f, -1.199f, 0.0f, -1.597f)
                lineToRelative(4.721f, -3.504f)
                curveToRelative(0.656f, -0.487f, 1.587f, -0.019f, 1.587f, 0.799f)
                verticalLineToRelative(1.701f)
                lineToRelative(3.368f, -2.5f)
                curveToRelative(0.656f, -0.487f, 1.587f, -0.019f, 1.587f, 0.799f)
                close()
            }
        }
        .build()
        return _rewindButtonCircle!!
    }

private var _rewindButtonCircle: ImageVector? = null
