package me.localx.icons.straight.bold

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

public val Icons.Bold.Live: ImageVector
    get() {
        if (_live != null) {
            return _live!!
        }
        _live = Builder(name = "Live", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 8.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
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
                moveTo(10.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.0f)
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
                moveTo(3.0f, 12.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(21.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(-3.35f)
                curveToRelative(-0.456f, 0.218f, -0.961f, 0.35f, -1.5f, 0.35f)
                reflectiveCurveToRelative(-1.044f, -0.132f, -1.5f, -0.35f)
                verticalLineToRelative(6.35f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(20.5f, 2.0f)
                lineTo(3.5f, 2.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(3.85f)
                curveToRelative(0.456f, -0.218f, 0.961f, -0.35f, 1.5f, -0.35f)
                reflectiveCurveToRelative(1.044f, 0.132f, 1.5f, 0.35f)
                verticalLineToRelative(-3.85f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _live!!
    }

private var _live: ImageVector? = null
