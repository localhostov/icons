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

public val Icons.Outline.MessageArrowDown: ImageVector
    get() {
        if (_messageArrowDown != null) {
            return _messageArrowDown!!
        }
        _messageArrowDown = Builder(name = "MessageArrowDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(6.923f)
                lineToRelative(3.749f, 3.157f)
                curveToRelative(0.382f, 0.339f, 0.861f, 0.507f, 1.337f, 0.507f)
                curveToRelative(0.468f, 0.0f, 0.931f, -0.163f, 1.292f, -0.484f)
                lineToRelative(3.848f, -3.18f)
                horizontalLineToRelative(6.852f)
                lineTo(24.001f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 18.0f)
                horizontalLineToRelative(-5.571f)
                lineToRelative(-4.448f, 3.645f)
                lineToRelative(-4.327f, -3.645f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(15.291f, 9.706f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.299f, 3.299f)
                curveToRelative(-0.388f, 0.387f, -0.897f, 0.581f, -1.406f, 0.581f)
                reflectiveCurveToRelative(-1.018f, -0.193f, -1.405f, -0.58f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.291f, 2.291f)
                verticalLineToRelative(-6.997f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.008f)
                lineToRelative(2.291f, -2.302f)
                close()
            }
        }
        .build()
        return _messageArrowDown!!
    }

private var _messageArrowDown: ImageVector? = null
