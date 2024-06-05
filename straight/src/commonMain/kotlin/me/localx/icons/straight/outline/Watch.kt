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

public val Icons.Outline.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(name = "Watch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 11.586f)
                lineToRelative(2.707f, 2.707f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.293f, -3.293f)
                verticalLineToRelative(-5.414f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.586f)
                close()
                moveTo(18.0f, 19.995f)
                verticalLineToRelative(4.005f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.836f)
                curveToRelative(-1.226f, 0.537f, -2.578f, 0.836f, -4.0f, 0.836f)
                reflectiveCurveToRelative(-2.774f, -0.299f, -4.0f, -0.836f)
                verticalLineToRelative(2.836f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.005f)
                curveToRelative(-2.427f, -1.826f, -4.0f, -4.73f, -4.0f, -7.995f)
                reflectiveCurveToRelative(1.573f, -6.169f, 4.0f, -7.995f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.836f)
                curveToRelative(1.226f, -0.537f, 2.578f, -0.836f, 4.0f, -0.836f)
                reflectiveCurveToRelative(2.774f, 0.299f, 4.0f, 0.836f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.005f)
                curveToRelative(2.427f, 1.826f, 4.0f, 4.73f, 4.0f, 7.995f)
                reflectiveCurveToRelative(-1.573f, 6.169f, -4.0f, 7.995f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, -3.589f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.589f, -8.0f, -8.0f, -8.0f)
                reflectiveCurveTo(4.0f, 7.589f, 4.0f, 12.0f)
                reflectiveCurveToRelative(3.589f, 8.0f, 8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _watch!!
    }

private var _watch: ImageVector? = null
