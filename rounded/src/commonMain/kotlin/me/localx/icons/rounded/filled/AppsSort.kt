package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.AppsSort: ImageVector
    get() {
        if (_appsSort != null) {
            return _appsSort!!
        }
        _appsSort = Builder(name = "AppsSort", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.029f, viewportHeight = 512.029f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(85.342f, 0.029f)
                horizontalLineToRelative(64.0f)
                curveToRelative(47.128f, 0.0f, 85.333f, 38.205f, 85.333f, 85.333f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 47.128f, -38.205f, 85.333f, -85.333f, 85.333f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-47.128f, 0.0f, -85.333f, -38.205f, -85.333f, -85.333f)
                verticalLineToRelative(-64.0f)
                curveTo(0.009f, 38.234f, 38.214f, 0.029f, 85.342f, 0.029f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(85.342f, 277.362f)
                horizontalLineToRelative(64.0f)
                curveToRelative(47.128f, 0.0f, 85.333f, 38.205f, 85.333f, 85.333f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 47.128f, -38.205f, 85.333f, -85.333f, 85.333f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-47.128f, 0.0f, -85.333f, -38.205f, -85.333f, -85.333f)
                verticalLineToRelative(-64.0f)
                curveTo(0.009f, 315.567f, 38.214f, 277.362f, 85.342f, 277.362f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(475.593f, 408.05f)
                lineToRelative(-48.917f, 48.853f)
                verticalLineTo(55.154f)
                lineToRelative(48.917f, 48.853f)
                curveToRelative(8.336f, 8.33f, 21.846f, 8.325f, 30.176f, -0.011f)
                reflectiveCurveToRelative(8.325f, -21.846f, -0.011f, -30.176f)
                lineToRelative(-55.189f, -55.104f)
                curveToRelative(-24.987f, -24.956f, -65.466f, -24.956f, -90.453f, 0.0f)
                lineToRelative(-55.189f, 55.104f)
                curveToRelative(-8.336f, 8.33f, -8.341f, 21.84f, -0.011f, 30.176f)
                curveToRelative(8.33f, 8.336f, 21.84f, 8.341f, 30.176f, 0.011f)
                lineToRelative(48.917f, -48.853f)
                verticalLineToRelative(401.749f)
                lineToRelative(-48.917f, -48.853f)
                curveToRelative(-8.342f, -8.33f, -21.857f, -8.32f, -30.187f, 0.021f)
                curveToRelative(-8.33f, 8.342f, -8.32f, 21.857f, 0.021f, 30.187f)
                lineToRelative(55.189f, 55.104f)
                curveToRelative(25.016f, 24.886f, 65.437f, 24.886f, 90.453f, 0.0f)
                lineToRelative(55.189f, -55.104f)
                curveToRelative(8.342f, -8.33f, 8.351f, -21.845f, 0.021f, -30.187f)
                curveTo(497.449f, 399.73f, 483.934f, 399.72f, 475.593f, 408.05f)
                close()
            }
        }
        .build()
        return _appsSort!!
    }

private var _appsSort: ImageVector? = null
