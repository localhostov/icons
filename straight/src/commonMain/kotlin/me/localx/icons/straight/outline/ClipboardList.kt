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

public val Icons.Outline.ClipboardList: ImageVector
    get() {
        if (_clipboardList != null) {
            return _clipboardList!!
        }
        _clipboardList = Builder(name = "ClipboardList", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(21.0f, 2.0f)
                lineTo(21.0f, 21.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(6.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(3.0f, 2.0f)
                horizontalLineToRelative(5.171f)
                curveToRelative(0.413f, -1.164f, 1.525f, -2.0f, 2.829f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.304f, 0.0f, 2.416f, 0.836f, 2.829f, 2.0f)
                horizontalLineToRelative(5.171f)
                close()
                moveTo(19.0f, 4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 4.0f)
                lineTo(5.0f, 21.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(19.0f, 4.0f)
                close()
                moveTo(11.0f, 10.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 18.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _clipboardList!!
    }

private var _clipboardList: ImageVector? = null
