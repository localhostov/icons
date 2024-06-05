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

public val Icons.Outline.CvvCard: ImageVector
    get() {
        if (_cvvCard != null) {
            return _cvvCard!!
        }
        _cvvCard = Builder(name = "CvvCard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.248f, 15.0f)
                horizontalLineToRelative(1.252f)
                lineToRelative(-1.252f, 6.0f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-1.511f, -6.0f)
                horizontalLineToRelative(1.252f)
                lineToRelative(0.826f, 3.282f)
                lineToRelative(0.684f, -3.282f)
                close()
                moveTo(12.987f, 15.001f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.109f, -0.001f, -2.0f, 0.889f, -2.0f, 1.984f)
                verticalLineToRelative(2.03f)
                curveToRelative(0.0f, 1.094f, 0.891f, 1.985f, 2.0f, 1.985f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.104f, -0.008f, 2.0f, -0.895f, 2.0f, -1.985f)
                verticalLineToRelative(-0.084f)
                horizontalLineToRelative(-1.255f)
                reflectiveCurveToRelative(0.005f, 0.054f, 0.005f, 0.084f)
                curveToRelative(0.0f, 0.394f, -0.342f, 0.728f, -0.75f, 0.735f)
                curveToRelative(-0.391f, 0.0f, -0.749f, -0.302f, -0.749f, -0.751f)
                verticalLineToRelative(-1.998f)
                curveToRelative(0.0f, -0.449f, 0.358f, -0.751f, 0.749f, -0.751f)
                curveToRelative(0.408f, 0.007f, 0.75f, 0.34f, 0.75f, 0.735f)
                curveToRelative(0.0f, 0.03f, -0.005f, 0.084f, -0.005f, 0.084f)
                horizontalLineToRelative(1.255f)
                verticalLineToRelative(-0.084f)
                curveToRelative(0.0f, -1.09f, -0.896f, -1.977f, -2.0f, -1.984f)
                close()
                moveTo(22.064f, 18.282f)
                lineToRelative(-0.826f, -3.282f)
                horizontalLineToRelative(-1.252f)
                lineToRelative(1.511f, 6.0f)
                horizontalLineToRelative(1.25f)
                lineToRelative(1.252f, -6.0f)
                horizontalLineToRelative(-1.252f)
                lineToRelative(-0.684f, 3.282f)
                close()
                moveTo(23.999f, 6.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 10.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(6.988f)
                verticalLineToRelative(0.015f)
                curveToRelative(0.0f, 0.706f, 0.198f, 1.375f, 0.541f, 1.971f)
                horizontalLineToRelative(-1.529f)
                verticalLineToRelative(0.014f)
                lineTo(0.0f, 21.0f)
                lineTo(0.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                lineTo(21.0f, 3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(21.999f, 8.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 5.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                lineTo(22.0f, 8.0f)
                close()
            }
        }
        .build()
        return _cvvCard!!
    }

private var _cvvCard: ImageVector? = null
