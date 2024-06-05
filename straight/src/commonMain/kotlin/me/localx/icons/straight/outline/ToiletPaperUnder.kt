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

public val Icons.Outline.ToiletPaperUnder: ImageVector
    get() {
        if (_toiletPaperUnder != null) {
            return _toiletPaperUnder!!
        }
        _toiletPaperUnder = Builder(name = "ToiletPaperUnder", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 20.0f)
                lineToRelative(-0.033f, -12.5f)
                curveToRelative(-0.283f, -4.279f, -2.363f, -7.5f, -4.967f, -7.5f)
                lineTo(5.0f, 0.0f)
                curveTo(2.196f, 0.0f, 0.0f, 3.733f, 0.0f, 8.5f)
                reflectiveCurveToRelative(2.196f, 8.5f, 5.0f, 8.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 8.5f)
                curveToRelative(0.0f, 3.831f, -1.581f, 6.5f, -3.0f, 6.5f)
                reflectiveCurveToRelative(-3.0f, -2.669f, -3.0f, -6.5f)
                reflectiveCurveToRelative(1.581f, -6.5f, 3.0f, -6.5f)
                reflectiveCurveToRelative(3.0f, 2.669f, 3.0f, 6.5f)
                close()
                moveTo(2.009f, 9.0f)
                horizontalLineToRelative(1.991f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.916f)
                curveToRelative(0.345f, -3.01f, 1.691f, -5.0f, 2.916f, -5.0f)
                horizontalLineToRelative(8.745f)
                curveToRelative(-0.864f, 1.246f, -1.468f, 2.992f, -1.67f, 5.0f)
                horizontalLineToRelative(-2.075f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.008f)
                curveToRelative(0.079f, 2.427f, 0.731f, 4.551f, 1.736f, 6.0f)
                lineTo(5.0f, 15.0f)
                curveToRelative(-1.356f, 0.0f, -2.861f, -2.439f, -2.991f, -6.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.135f, 0.0f, 2.17f, -0.612f, 3.0f, -1.655f)
                verticalLineToRelative(4.655f)
                curveToRelative(0.0f, 0.728f, 0.195f, 1.411f, 0.537f, 2.0f)
                horizontalLineToRelative(-8.537f)
                close()
                moveTo(16.0f, 8.5f)
                curveToRelative(0.0f, -0.828f, 0.448f, -1.5f, 1.0f, -1.5f)
                reflectiveCurveToRelative(1.0f, 0.672f, 1.0f, 1.5f)
                reflectiveCurveToRelative(-0.448f, 1.5f, -1.0f, 1.5f)
                reflectiveCurveToRelative(-1.0f, -0.672f, -1.0f, -1.5f)
                close()
                moveTo(6.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _toiletPaperUnder!!
    }

private var _toiletPaperUnder: ImageVector? = null
