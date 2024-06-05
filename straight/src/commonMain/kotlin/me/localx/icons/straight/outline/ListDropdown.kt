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

public val Icons.Outline.ListDropdown: ImageVector
    get() {
        if (_listDropdown != null) {
            return _listDropdown!!
        }
        _listDropdown = Builder(name = "ListDropdown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(3.0f, 2.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                lineTo(2.0f, 8.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 22.0f)
                lineTo(2.0f, 10.0f)
                lineTo(22.0f, 10.0f)
                verticalLineToRelative(12.0f)
                lineTo(2.0f, 22.0f)
                close()
                moveTo(5.0f, 17.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(5.0f, 13.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(15.85f, 6.71f)
                lineToRelative(-2.76f, -2.71f)
                horizontalLineToRelative(6.91f)
                lineToRelative(-2.76f, 2.71f)
                curveToRelative(-0.39f, 0.39f, -1.01f, 0.39f, -1.4f, 0.0f)
                close()
            }
        }
        .build()
        return _listDropdown!!
    }

private var _listDropdown: ImageVector? = null
