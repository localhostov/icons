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

public val Icons.Outline.InsertArrows: ImageVector
    get() {
        if (_insertArrows != null) {
            return _insertArrows!!
        }
        _insertArrows = Builder(name = "InsertArrows", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.491f, 7.504f)
                lineTo(0.0f, 1.359f)
                lineTo(1.491f, 0.026f)
                lineToRelative(5.492f, 6.146f)
                curveToRelative(0.655f, 0.734f, 1.017f, 1.681f, 1.017f, 2.666f)
                verticalLineToRelative(7.169f)
                lineToRelative(1.498f, -1.508f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.506f, 2.506f)
                curveToRelative(-0.388f, 0.387f, -0.897f, 0.581f, -1.406f, 0.581f)
                reflectiveCurveToRelative(-1.018f, -0.193f, -1.405f, -0.58f)
                lineToRelative(-2.507f, -2.507f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.498f, 1.498f)
                verticalLineToRelative(-7.159f)
                curveToRelative(0.0f, -0.493f, -0.181f, -0.966f, -0.509f, -1.333f)
                close()
                moveTo(17.0f, 18.999f)
                curveToRelative(0.509f, 0.0f, 1.019f, -0.193f, 1.406f, -0.581f)
                lineToRelative(2.506f, -2.506f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.498f, 1.508f)
                verticalLineToRelative(-7.169f)
                curveToRelative(0.0f, -0.493f, 0.181f, -0.966f, 0.509f, -1.333f)
                lineToRelative(5.492f, -6.146f)
                lineTo(22.509f, 0.026f)
                lineToRelative(-5.492f, 6.146f)
                curveToRelative(-0.655f, 0.734f, -1.017f, 1.68f, -1.017f, 2.665f)
                verticalLineToRelative(7.159f)
                lineToRelative(-1.498f, -1.498f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.507f, 2.507f)
                curveToRelative(0.388f, 0.386f, 0.896f, 0.58f, 1.405f, 0.58f)
                close()
                moveTo(22.0f, 20.999f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 21.999f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-9.0f)
                lineTo(0.0f, 11.999f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _insertArrows!!
    }

private var _insertArrows: ImageVector? = null
