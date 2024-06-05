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

public val Icons.Outline.BrokenImage: ImageVector
    get() {
        if (_brokenImage != null) {
            return _brokenImage!!
        }
        _brokenImage = Builder(name = "BrokenImage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.41f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                lineTo(2.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 7.59f)
                lineTo(14.41f, 0.0f)
                close()
                moveTo(15.0f, 3.41f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(-3.59f)
                lineTo(15.0f, 3.41f)
                close()
                moveTo(5.0f, 2.0f)
                lineTo(13.0f, 2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(6.07f)
                lineToRelative(-3.98f, -3.98f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-4.02f, 4.02f)
                lineTo(4.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(4.0f, 22.0f)
                verticalLineToRelative(-4.07f)
                lineToRelative(4.02f, -4.02f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(3.98f, 3.98f)
                verticalLineToRelative(4.1f)
                lineTo(4.0f, 21.99f)
                close()
            }
        }
        .build()
        return _brokenImage!!
    }

private var _brokenImage: ImageVector? = null
