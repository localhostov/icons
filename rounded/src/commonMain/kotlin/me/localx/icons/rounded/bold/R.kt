package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.R: ImageVector
    get() {
        if (_r != null) {
            return _r!!
        }
        _r = Builder(name = "R", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.657f, 14.294f)
                curveTo(24.829f, 10.966f, 22.51f, 0.038f, 14.5f, 0.0f)
                horizontalLineTo(7.5f)
                curveTo(4.467f, 0.0f, 2.0f, 2.468f, 2.0f, 5.5f)
                verticalLineTo(22.5f)
                curveToRelative(0.034f, 1.972f, 2.967f, 1.971f, 3.0f, 0.0f)
                verticalLineToRelative(-7.5f)
                horizontalLineTo(14.5f)
                curveToRelative(0.038f, 0.0f, 0.076f, -0.005f, 0.114f, -0.006f)
                lineToRelative(4.575f, 8.234f)
                curveToRelative(0.405f, 0.731f, 1.33f, 0.981f, 2.04f, 0.583f)
                curveToRelative(0.725f, -0.402f, 0.985f, -1.315f, 0.583f, -2.04f)
                lineToRelative(-4.154f, -7.478f)
                close()
                moveTo(5.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(5.935f, 0.156f, 5.931f, 8.846f, 0.0f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.5f)
                close()
            }
        }
        .build()
        return _r!!
    }

private var _r: ImageVector? = null
