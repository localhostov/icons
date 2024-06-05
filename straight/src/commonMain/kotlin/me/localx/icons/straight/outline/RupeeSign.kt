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

public val Icons.Outline.RupeeSign: ImageVector
    get() {
        if (_rupeeSign != null) {
            return _rupeeSign!!
        }
        _rupeeSign = Builder(name = "RupeeSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 7.5f)
                curveTo(15.0f, 3.364f, 11.636f, 0.0f, 7.5f, 0.0f)
                lineTo(0.0f, 0.0f)
                lineTo(0.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 15.0f)
                lineTo(7.5f, 15.0f)
                curveToRelative(0.127f, 0.0f, 0.253f, -0.003f, 0.378f, -0.009f)
                lineToRelative(4.851f, 9.009f)
                horizontalLineToRelative(2.272f)
                lineToRelative(-5.065f, -9.406f)
                curveToRelative(2.944f, -1.013f, 5.065f, -3.81f, 5.065f, -7.094f)
                close()
                moveTo(7.5f, 13.0f)
                lineTo(2.0f, 13.0f)
                lineTo(2.0f, 2.0f)
                lineTo(7.5f, 2.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.467f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(24.0f, 21.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.466f, -0.297f, -0.879f, -0.739f, -1.026f)
                lineToRelative(-3.154f, -1.05f)
                curveToRelative(-1.26f, -0.421f, -2.106f, -1.596f, -2.106f, -2.924f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.466f, 0.297f, 0.879f, 0.739f, 1.026f)
                lineToRelative(3.154f, 1.05f)
                curveToRelative(1.26f, 0.421f, 2.106f, 1.596f, 2.106f, 2.924f)
                close()
            }
        }
        .build()
        return _rupeeSign!!
    }

private var _rupeeSign: ImageVector? = null
