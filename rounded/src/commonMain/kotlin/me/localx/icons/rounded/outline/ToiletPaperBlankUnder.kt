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

public val Icons.Outline.ToiletPaperBlankUnder: ImageVector
    get() {
        if (_toiletPaperBlankUnder != null) {
            return _toiletPaperBlankUnder!!
        }
        _toiletPaperBlankUnder = Builder(name = "ToiletPaperBlankUnder", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.259f, 18.858f)
                curveToRelative(-0.227f, -0.09f, -0.297f, -0.172f, -0.269f, -1.293f)
                curveToRelative(0.005f, -0.183f, 0.01f, -9.065f, 0.01f, -9.065f)
                curveToRelative(0.0f, -4.767f, -2.196f, -8.5f, -5.0f, -8.5f)
                lineTo(5.0f, 0.0f)
                curveTo(2.196f, 0.0f, 0.0f, 3.733f, 0.0f, 8.5f)
                reflectiveCurveToRelative(2.196f, 8.5f, 5.0f, 8.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(8.347f)
                curveToRelative(1.463f, 0.0f, 2.653f, -1.19f, 2.653f, -2.654f)
                curveToRelative(0.0f, -1.088f, -0.684f, -2.065f, -1.741f, -2.488f)
                close()
                moveTo(20.0f, 8.5f)
                curveToRelative(0.0f, 3.831f, -1.581f, 6.5f, -3.0f, 6.5f)
                reflectiveCurveToRelative(-3.0f, -2.669f, -3.0f, -6.5f)
                reflectiveCurveToRelative(1.581f, -6.5f, 3.0f, -6.5f)
                reflectiveCurveToRelative(3.0f, 2.669f, 3.0f, 6.5f)
                close()
                moveTo(2.0f, 8.5f)
                curveToRelative(0.0f, -3.831f, 1.581f, -6.5f, 3.0f, -6.5f)
                horizontalLineToRelative(8.745f)
                curveToRelative(-1.073f, 1.547f, -1.745f, 3.866f, -1.745f, 6.5f)
                reflectiveCurveToRelative(0.671f, 4.953f, 1.745f, 6.5f)
                lineTo(5.0f, 15.0f)
                curveToRelative(-1.419f, 0.0f, -3.0f, -2.669f, -3.0f, -6.5f)
                close()
                moveTo(21.347f, 22.0f)
                horizontalLineToRelative(-8.347f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.135f, 0.0f, 2.17f, -0.612f, 3.0f, -1.655f)
                curveToRelative(0.0f, 0.0f, -0.005f, 2.003f, -0.009f, 2.17f)
                curveToRelative(-0.028f, 1.083f, -0.066f, 2.566f, 1.525f, 3.202f)
                curveToRelative(0.233f, 0.093f, 0.483f, 0.308f, 0.483f, 0.63f)
                curveToRelative(0.0f, 0.36f, -0.293f, 0.654f, -0.653f, 0.654f)
                close()
                moveTo(17.0f, 7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.672f, 1.0f, 1.5f)
                reflectiveCurveToRelative(-0.448f, 1.5f, -1.0f, 1.5f)
                reflectiveCurveToRelative(-1.0f, -0.672f, -1.0f, -1.5f)
                reflectiveCurveToRelative(0.448f, -1.5f, 1.0f, -1.5f)
                close()
            }
        }
        .build()
        return _toiletPaperBlankUnder!!
    }

private var _toiletPaperBlankUnder: ImageVector? = null
