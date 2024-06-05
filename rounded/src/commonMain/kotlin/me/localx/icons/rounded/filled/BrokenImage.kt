package me.localx.icons.rounded.filled

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

public val Icons.Filled.BrokenImage: ImageVector
    get() {
        if (_brokenImage != null) {
            return _brokenImage!!
        }
        _brokenImage = Builder(name = "BrokenImage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 7.0f)
                lineTo(14.0f, 0.46f)
                curveToRelative(0.91f, 0.35f, 1.75f, 0.88f, 2.46f, 1.59f)
                lineToRelative(3.48f, 3.49f)
                curveToRelative(0.71f, 0.71f, 1.24f, 1.55f, 1.59f, 2.46f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                close()
                moveTo(5.49f, 13.63f)
                curveToRelative(0.84f, -0.84f, 2.2f, -0.84f, 3.04f, 0.0f)
                lineToRelative(3.37f, 3.37f)
                curveToRelative(0.06f, 0.06f, 0.15f, 0.06f, 0.21f, 0.0f)
                lineToRelative(3.37f, -3.37f)
                curveToRelative(0.84f, -0.84f, 2.2f, -0.84f, 3.04f, 0.0f)
                lineToRelative(3.48f, 3.48f)
                verticalLineToRelative(-6.63f)
                curveToRelative(0.0f, -0.16f, -0.01f, -0.32f, -0.02f, -0.49f)
                horizontalLineToRelative(-6.98f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(12.0f, 0.02f)
                curveToRelative(-0.16f, -0.01f, -0.32f, -0.02f, -0.49f, -0.02f)
                lineTo(7.0f, 0.0f)
                curveTo(4.24f, 0.0f, 2.0f, 2.24f, 2.0f, 5.0f)
                verticalLineToRelative(12.12f)
                lineToRelative(3.49f, -3.49f)
                close()
                moveTo(17.11f, 15.04f)
                reflectiveCurveToRelative(-0.16f, -0.05f, -0.21f, 0.0f)
                lineToRelative(-3.37f, 3.37f)
                curveToRelative(-0.84f, 0.84f, -2.2f, 0.84f, -3.04f, 0.0f)
                lineToRelative(-3.37f, -3.37f)
                curveToRelative(-0.06f, -0.06f, -0.16f, -0.06f, -0.21f, 0.0f)
                lineToRelative(-4.82f, 4.82f)
                curveToRelative(0.41f, 2.34f, 2.46f, 4.13f, 4.92f, 4.13f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.46f, 0.0f, 4.51f, -1.79f, 4.92f, -4.13f)
                lineToRelative(-4.82f, -4.82f)
                close()
            }
        }
        .build()
        return _brokenImage!!
    }

private var _brokenImage: ImageVector? = null
