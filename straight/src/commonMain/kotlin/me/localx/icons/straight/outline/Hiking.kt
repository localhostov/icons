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

public val Icons.Outline.Hiking: ImageVector
    get() {
        if (_hiking != null) {
            return _hiking!!
        }
        _hiking = Builder(name = "Hiking", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.48f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 12.98f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.48f, 2.5f)
                close()
                moveTo(20.98f, 7.0f)
                lineTo(20.98f, 24.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.98f, 12.0f)
                lineTo(15.362f, 12.0f)
                lineToRelative(-0.906f, -1.813f)
                lineToRelative(-0.785f, 4.033f)
                lineToRelative(-1.808f, -1.177f)
                lineToRelative(0.979f, -5.029f)
                curveToRelative(-0.033f, 0.0f, -1.96f, -0.014f, -1.96f, -0.014f)
                lineTo(9.836f, 13.372f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.437f, 1.03f)
                lineToRelative(4.707f, 3.055f)
                lineTo(14.98f, 24.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.98f, 18.543f)
                lineTo(9.185f, 16.08f)
                arcToRelative(3.009f, 3.009f, 0.0f, false, true, -0.744f, -0.694f)
                arcTo(3.3f, 3.3f, 0.0f, false, true, 6.469f, 16.0f)
                curveTo(4.8f, 16.0f, 3.0f, 14.748f, 3.0f, 12.0f)
                curveTo(3.0f, 8.636f, 6.036f, 6.0f, 9.913f, 6.0f)
                horizontalLineToRelative(2.831f)
                arcToRelative(2.984f, 2.984f, 0.0f, false, true, 2.684f, 1.658f)
                lineTo(16.6f, 10.0f)
                lineTo(18.98f, 10.0f)
                lineTo(18.98f, 7.0f)
                close()
                moveTo(7.912f, 12.781f)
                horizontalLineToRelative(0.0f)
                lineTo(8.824f, 8.1f)
                curveTo(6.8f, 8.478f, 5.0f, 9.874f, 5.0f, 12.0f)
                curveToRelative(0.0f, 1.9f, 1.224f, 2.0f, 1.469f, 2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.912f, 12.781f)
                close()
                moveTo(7.941f, 17.64f)
                lineTo(6.854f, 24.0f)
                lineTo(8.9f, 24.0f)
                lineToRelative(0.847f, -5.174f)
                lineTo(8.1f, 17.757f)
                curveTo(8.04f, 17.722f, 7.994f, 17.677f, 7.941f, 17.64f)
                close()
            }
        }
        .build()
        return _hiking!!
    }

private var _hiking: ImageVector? = null
