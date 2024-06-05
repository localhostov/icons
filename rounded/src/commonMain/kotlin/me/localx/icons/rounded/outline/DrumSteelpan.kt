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

public val Icons.Outline.DrumSteelpan: ImageVector
    get() {
        if (_drumSteelpan != null) {
            return _drumSteelpan!!
        }
        _drumSteelpan = Builder(name = "DrumSteelpan", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.25f)
                curveTo(24.0f, 3.701f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 3.701f, 0.0f, 8.25f)
                verticalLineToRelative(7.393f)
                curveToRelative(0.0f, 4.608f, 5.383f, 8.357f, 12.0f, 8.357f)
                reflectiveCurveToRelative(12.0f, -3.749f, 12.0f, -8.357f)
                verticalLineToRelative(-7.393f)
                close()
                moveTo(9.484f, 10.522f)
                curveToRelative(0.02f, -0.031f, 0.49f, -1.312f, 0.512f, -1.907f)
                curveToRelative(0.567f, 0.256f, 1.219f, 0.385f, 2.004f, 0.385f)
                reflectiveCurveToRelative(1.437f, -0.128f, 2.004f, -0.385f)
                curveToRelative(0.021f, 0.595f, 0.492f, 1.876f, 0.512f, 1.907f)
                curveToRelative(0.951f, 1.552f, 2.601f, 2.174f, 4.034f, 2.406f)
                curveToRelative(-1.769f, 0.973f, -4.071f, 1.571f, -6.549f, 1.571f)
                reflectiveCurveToRelative(-4.78f, -0.598f, -6.549f, -1.571f)
                curveToRelative(1.432f, -0.232f, 3.083f, -0.854f, 4.034f, -2.406f)
                close()
                moveTo(22.0f, 8.25f)
                curveToRelative(0.0f, 0.986f, -0.388f, 1.927f, -1.072f, 2.766f)
                curveToRelative(-0.507f, 0.049f, -3.55f, 0.26f, -4.678f, -1.493f)
                curveToRelative(-0.576f, -1.276f, -0.158f, -2.266f, 1.333f, -5.4f)
                lineToRelative(0.399f, -0.842f)
                curveToRelative(2.422f, 1.153f, 4.018f, 2.969f, 4.018f, 4.969f)
                close()
                moveTo(16.092f, 2.568f)
                curveToRelative(-1.828f, 3.641f, -2.355f, 4.432f, -4.092f, 4.432f)
                reflectiveCurveToRelative(-2.262f, -0.787f, -4.092f, -4.432f)
                curveToRelative(1.257f, -0.364f, 2.644f, -0.568f, 4.092f, -0.568f)
                reflectiveCurveToRelative(2.836f, 0.204f, 4.092f, 0.568f)
                close()
                moveTo(6.018f, 3.281f)
                lineToRelative(0.399f, 0.842f)
                curveToRelative(1.491f, 3.135f, 1.909f, 4.124f, 1.333f, 5.4f)
                curveToRelative(-1.135f, 1.765f, -4.163f, 1.542f, -4.678f, 1.493f)
                curveToRelative(-0.684f, -0.839f, -1.072f, -1.78f, -1.072f, -2.766f)
                curveToRelative(0.0f, -2.0f, 1.596f, -3.816f, 4.018f, -4.969f)
                close()
                moveTo(22.0f, 15.643f)
                curveToRelative(0.0f, 3.506f, -4.486f, 6.357f, -10.0f, 6.357f)
                reflectiveCurveToRelative(-10.0f, -2.852f, -10.0f, -6.357f)
                verticalLineToRelative(-2.838f)
                curveToRelative(2.151f, 2.225f, 5.83f, 3.695f, 10.0f, 3.695f)
                reflectiveCurveToRelative(7.849f, -1.47f, 10.0f, -3.695f)
                verticalLineToRelative(2.838f)
                close()
            }
        }
        .build()
        return _drumSteelpan!!
    }

private var _drumSteelpan: ImageVector? = null
