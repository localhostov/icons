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

public val Icons.Outline.CloudExclamation: ImageVector
    get() {
        if (_cloudExclamation != null) {
            return _cloudExclamation!!
        }
        _cloudExclamation = Builder(name = "CloudExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(11.0f, 23.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.797f, 7.203f)
                curveToRelative(-0.824f, -3.584f, -4.054f, -6.203f, -7.797f, -6.203f)
                curveTo(5.589f, 1.0f, 2.0f, 4.589f, 2.0f, 9.0f)
                curveToRelative(0.0f, 1.29f, 0.303f, 2.535f, 0.884f, 3.66f)
                curveToRelative(-1.746f, 0.943f, -2.884f, 2.786f, -2.884f, 4.84f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.593f, 1.074f, -2.985f, 2.613f, -3.387f)
                lineToRelative(1.427f, -0.373f)
                lineToRelative(-0.875f, -1.188f)
                curveToRelative(-0.762f, -1.035f, -1.165f, -2.264f, -1.165f, -3.553f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                curveToRelative(2.994f, 0.0f, 5.55f, 2.233f, 5.946f, 5.195f)
                lineToRelative(0.102f, 0.757f)
                lineToRelative(0.757f, 0.102f)
                curveToRelative(2.962f, 0.396f, 5.195f, 2.952f, 5.195f, 5.946f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, -3.589f, 8.0f, -8.0f)
                curveToRelative(0.0f, -3.743f, -2.62f, -6.973f, -6.203f, -7.797f)
                close()
            }
        }
        .build()
        return _cloudExclamation!!
    }

private var _cloudExclamation: ImageVector? = null
