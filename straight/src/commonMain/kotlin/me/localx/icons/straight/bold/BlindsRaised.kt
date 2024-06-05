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

public val Icons.Bold.BlindsRaised: ImageVector
    get() {
        if (_blindsRaised != null) {
            return _blindsRaised!!
        }
        _blindsRaised = Builder(name = "BlindsRaised", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.338f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineTo(24.0f)
                horizontalLineTo(16.257f)
                curveToRelative(-0.686f, -0.83f, -1.13f, -1.866f, -1.232f, -3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(13.838f)
                curveToRelative(-1.181f, 0.563f, -2.0f, 1.769f, -2.0f, 3.162f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.393f, -0.819f, -2.599f, -2.0f, -3.162f)
                close()
                moveTo(3.0f, 10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(14.0f, 5.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _blindsRaised!!
    }

private var _blindsRaised: ImageVector? = null
