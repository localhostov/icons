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

public val Icons.Outline.BinBottles: ImageVector
    get() {
        if (_binBottles != null) {
            return _binBottles!!
        }
        _binBottles = Builder(name = "BinBottles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.858f, -1.28f, -3.411f, -3.0f, -3.858f)
                lineTo(19.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(13.0f, 2.812f)
                curveToRelative(1.223f, 0.71f, 2.17f, 1.838f, 2.65f, 3.188f)
                horizontalLineToRelative(2.35f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.858f, -1.28f, -3.411f, -3.0f, -3.858f)
                lineTo(11.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                lineTo(5.0f, 4.142f)
                curveToRelative(-1.72f, 0.447f, -3.0f, 2.0f, -3.0f, 3.858f)
                verticalLineToRelative(1.0f)
                lineTo(-0.033f, 9.0f)
                lineToRelative(1.916f, 12.456f)
                curveToRelative(0.227f, 1.474f, 1.474f, 2.544f, 2.965f, 2.544f)
                horizontalLineToRelative(14.303f)
                curveToRelative(1.491f, 0.0f, 2.738f, -1.07f, 2.965f, -2.544f)
                lineToRelative(1.916f, -12.456f)
                horizontalLineToRelative(-2.033f)
                close()
                moveTo(17.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 8.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(20.14f, 21.151f)
                curveToRelative(-0.076f, 0.492f, -0.492f, 0.849f, -0.989f, 0.849f)
                lineTo(4.849f, 22.0f)
                curveToRelative(-0.497f, 0.0f, -0.913f, -0.356f, -0.989f, -0.849f)
                lineToRelative(-1.562f, -10.151f)
                lineTo(21.702f, 11.0f)
                lineToRelative(-1.562f, 10.151f)
                close()
                moveTo(13.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(18.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(8.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _binBottles!!
    }

private var _binBottles: ImageVector? = null
