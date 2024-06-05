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

public val Icons.Outline.PointOfSaleBill: ImageVector
    get() {
        if (_pointOfSaleBill != null) {
            return _pointOfSaleBill!!
        }
        _pointOfSaleBill = Builder(name = "PointOfSaleBill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(4.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 6.5f)
                verticalLineToRelative(12.094f)
                lineToRelative(-3.126f, -1.9f)
                lineToRelative(-2.874f, 1.807f)
                lineToRelative(-2.0f, -1.257f)
                verticalLineToRelative(-2.432f)
                lineToRelative(2.0f, 1.254f)
                lineToRelative(2.801f, -1.756f)
                lineToRelative(1.199f, 0.729f)
                lineTo(22.0f, 6.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                curveToRelative(-2.254f, 0.0f, -4.109f, 1.671f, -4.433f, 3.836f)
                curveToRelative(0.572f, 0.547f, 0.933f, 1.312f, 0.933f, 2.164f)
                verticalLineToRelative(16.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 8.0f)
                curveToRelative(0.0f, -1.105f, 0.608f, -2.062f, 1.5f, -2.583f)
                verticalLineToRelative(-0.417f)
                curveTo(1.5f, 2.243f, 3.743f, 0.0f, 6.5f, 0.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(3.584f, 0.0f, 6.5f, 2.916f, 6.5f, 6.5f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-14.0f)
                close()
                moveTo(11.177f, 5.018f)
                curveToRelative(0.271f, -1.154f, 0.848f, -2.191f, 1.643f, -3.018f)
                horizontalLineToRelative(-6.321f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.061f, 0.0f, 0.117f, 0.014f, 0.177f, 0.018f)
                close()
            }
        }
        .build()
        return _pointOfSaleBill!!
    }

private var _pointOfSaleBill: ImageVector? = null
