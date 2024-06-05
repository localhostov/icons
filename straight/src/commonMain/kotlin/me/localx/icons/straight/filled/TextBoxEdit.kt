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

public val Icons.Filled.TextBoxEdit: ImageVector
    get() {
        if (_textBoxEdit != null) {
            return _textBoxEdit!!
        }
        _textBoxEdit = Builder(name = "TextBoxEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 2.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(12.5f, 0.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.771f, 0.0f, 1.468f, 0.301f, 2.0f, 0.78f)
                curveToRelative(0.532f, -0.48f, 1.229f, -0.78f, 2.0f, -0.78f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(21.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(7.0f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(17.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 0.552f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.771f, 0.0f, 1.468f, -0.301f, 2.0f, -0.78f)
                curveToRelative(0.532f, 0.48f, 1.229f, 0.78f, 2.0f, 0.78f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(15.0f, 21.0f)
                lineTo(0.0f, 21.0f)
                lineTo(0.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(18.0f)
                close()
                moveTo(11.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _textBoxEdit!!
    }

private var _textBoxEdit: ImageVector? = null
