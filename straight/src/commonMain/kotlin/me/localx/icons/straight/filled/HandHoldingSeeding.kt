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

public val Icons.Filled.HandHoldingSeeding: ImageVector
    get() {
        if (_handHoldingSeeding != null) {
            return _handHoldingSeeding!!
        }
        _handHoldingSeeding = Builder(name = "HandHoldingSeeding", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 0.0f)
                curveToRelative(5.543f, 0.0f, 7.86f, 2.151f, 7.994f, 7.497f)
                lineToRelative(0.012f, 0.006f)
                curveToRelative(0.132f, -5.35f, 2.448f, -7.503f, 7.994f, -7.503f)
                curveToRelative(0.0f, 5.368f, -2.018f, 7.71f, -7.0f, 7.974f)
                verticalLineToRelative(3.026f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.026f)
                curveToRelative(-4.982f, -0.264f, -7.0f, -2.606f, -7.0f, -7.974f)
                close()
                moveTo(23.444f, 13.258f)
                curveToRelative(-0.521f, -0.723f, -1.323f, -1.178f, -2.203f, -1.248f)
                curveToRelative(-0.875f, -0.076f, -1.74f, 0.246f, -2.331f, 0.839f)
                lineToRelative(-1.91f, 1.752f)
                verticalLineToRelative(1.399f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.188f)
                curveToRelative(-2.937f, 0.0f, -5.7f, 1.145f, -7.778f, 3.222f)
                lineTo(0.018f, 17.239f)
                lineToRelative(-0.018f, 6.761f)
                horizontalLineTo(11.32f)
                curveToRelative(2.746f, 0.0f, 5.377f, -1.019f, 7.408f, -2.868f)
                lineToRelative(4.318f, -3.935f)
                curveToRelative(1.07f, -1.073f, 1.241f, -2.766f, 0.397f, -3.939f)
                close()
            }
        }
        .build()
        return _handHoldingSeeding!!
    }

private var _handHoldingSeeding: ImageVector? = null
