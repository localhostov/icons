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

public val Icons.Outline.Live: ImageVector
    get() {
        if (_live != null) {
            return _live!!
        }
        _live = Builder(name = "Live", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.5f, 9.0f)
                curveToRelative(-0.539f, 0.0f, -1.044f, 0.132f, -1.5f, 0.35f)
                verticalLineToRelative(-3.35f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 5.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(3.05f)
                curveToRelative(-0.165f, -0.024f, -0.329f, -0.05f, -0.5f, -0.05f)
                close()
                moveTo(22.0f, 19.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-3.05f)
                curveToRelative(-0.165f, 0.024f, -0.329f, 0.05f, -0.5f, 0.05f)
                curveToRelative(-0.539f, 0.0f, -1.044f, -0.132f, -1.5f, -0.35f)
                verticalLineToRelative(5.35f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(5.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(20.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(12.0f, 16.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 8.0f)
                verticalLineToRelative(0.5f)
                lineToRelative(2.115f, 7.5f)
                horizontalLineToRelative(1.783f)
                lineToRelative(2.065f, -7.225f)
                lineToRelative(0.038f, -0.775f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.36f)
                lineToRelative(-1.0f, 3.5f)
                lineToRelative(-1.0f, -3.5f)
                verticalLineToRelative(-0.36f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(1.5f, 14.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _live!!
    }

private var _live: ImageVector? = null
