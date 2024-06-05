package me.localx.icons.rounded.outline

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

public val Icons.Outline.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                curveToRelative(0.0f, 2.949f, -2.583f, 4.0f, -5.0f, 4.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.979f, 3.979f, 0.0f, false, false, 1.514f, 3.109f)
                lineToRelative(3.572f, 7.972f)
                arcToRelative(3.233f, 3.233f, 0.0f, false, false, 2.953f, 1.919f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, false, 2.72f, -4.2f)
                lineToRelative(-2.2f, -4.8f)
                horizontalLineToRelative(2.441f)
                curveToRelative(2.417f, 0.0f, 5.0f, 1.051f, 5.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(8.937f, 20.619f)
                arcToRelative(0.983f, 0.983f, 0.0f, false, true, -0.898f, 1.381f)
                arcToRelative(1.232f, 1.232f, 0.0f, false, true, -1.126f, -0.734f)
                lineToRelative(-2.808f, -6.266f)
                horizontalLineToRelative(2.254f)
                close()
                moveTo(16.0f, 14.6f)
                arcToRelative(7.723f, 7.723f, 0.0f, false, false, -5.0f, -1.6f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(7.723f, 7.723f, 0.0f, false, false, 5.0f, -1.595f)
                close()
                moveTo(23.9f, 15.452f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.342f, 0.448f)
                lineToRelative(-2.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.894f, -1.79f)
                lineToRelative(2.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.448f, 1.337f)
                close()
                moveTo(20.11f, 6.452f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.448f, -1.342f)
                lineToRelative(2.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.894f, 1.79f)
                lineToRelative(-2.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.342f, -0.448f)
                close()
                moveTo(20.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
