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

public val Icons.Outline.RectanglePro: ImageVector
    get() {
        if (_rectanglePro != null) {
            return _rectanglePro!!
        }
        _rectanglePro = Builder(name = "RectanglePro", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(1.0f)
                lineTo(22.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(21.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveTo(1.35f, 2.0f, 0.0f, 3.35f, 0.0f, 5.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 6.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 17.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.88f)
                curveToRelative(1.45f, 0.0f, 2.78f, 0.98f, 3.06f, 2.4f)
                curveToRelative(0.37f, 1.92f, -1.09f, 3.6f, -2.94f, 3.6f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(2.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(2.0f, 10.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.89f, 13.31f)
                lineToRelative(2.11f, 3.69f)
                horizontalLineToRelative(-2.19f)
                lineToRelative(-1.72f, -3.01f)
                reflectiveCurveToRelative(-0.06f, 0.0f, -0.08f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.85f)
                curveToRelative(1.53f, 0.0f, 2.91f, 1.08f, 3.12f, 2.59f)
                curveToRelative(0.15f, 1.1f, -0.32f, 2.09f, -1.08f, 2.72f)
                close()
                moveTo(10.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 11.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(22.0f, 11.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _rectanglePro!!
    }

private var _rectanglePro: ImageVector? = null
