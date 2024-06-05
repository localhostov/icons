package me.localx.icons.straight.filled

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

public val Icons.Filled.HeadSideCoughSlash: ImageVector
    get() {
        if (_headSideCoughSlash != null) {
            return _headSideCoughSlash!!
        }
        _headSideCoughSlash = Builder(name = "HeadSideCoughSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.07f, 15.0f)
                horizontalLineToRelative(1.93f)
                verticalLineToRelative(-2.19f)
                lineToRelative(-0.07f, -0.18f)
                curveToRelative(-1.1f, -2.74f, -2.26f, -5.54f, -3.4f, -6.94f)
                curveTo(14.42f, 2.88f, 10.95f, 1.52f, 7.47f, 2.16f)
                curveToRelative(-0.98f, 0.18f, -1.93f, 0.55f, -2.81f, 1.09f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineTo(22.54f, 23.96f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-6.08f, -6.08f)
                lineToRelative(0.19f, -1.47f)
                close()
                moveTo(20.0f, 16.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(24.0f, 19.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                close()
                moveTo(22.0f, 15.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                close()
                moveTo(1.7f, 6.0f)
                lineToRelative(13.88f, 13.88f)
                curveToRelative(-0.25f, 0.07f, -0.52f, 0.12f, -0.79f, 0.12f)
                horizontalLineToRelative(-1.79f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(-3.81f)
                curveToRelative(0.0f, -0.47f, -0.18f, -0.94f, -0.5f, -1.31f)
                curveTo(-0.49f, 13.35f, -0.75f, 9.38f, 1.7f, 6.0f)
                close()
            }
        }
        .build()
        return _headSideCoughSlash!!
    }

private var _headSideCoughSlash: ImageVector? = null
