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

public val Icons.Outline.SealExclamation: ImageVector
    get() {
        if (_sealExclamation != null) {
            return _sealExclamation!!
        }
        _sealExclamation = Builder(name = "SealExclamation", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 14.0f)
                close()
                moveTo(13.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(15.52f, 20.5f)
                horizontalLineToRelative(4.98f)
                verticalLineToRelative(-4.98f)
                lineToRelative(3.52f, -3.52f)
                lineToRelative(-3.52f, -3.52f)
                lineTo(20.5f, 3.5f)
                horizontalLineToRelative(-4.98f)
                lineTo(12.0f, -0.02f)
                lineToRelative(-3.52f, 3.52f)
                lineTo(3.5f, 3.5f)
                verticalLineToRelative(4.98f)
                lineTo(-0.02f, 12.0f)
                lineToRelative(3.52f, 3.52f)
                verticalLineToRelative(4.98f)
                horizontalLineToRelative(4.98f)
                lineToRelative(3.52f, 3.52f)
                lineToRelative(3.52f, -3.52f)
                close()
                moveTo(5.5f, 14.69f)
                lineToRelative(-2.69f, -2.69f)
                lineToRelative(2.69f, -2.69f)
                verticalLineToRelative(-3.81f)
                horizontalLineToRelative(3.81f)
                lineToRelative(2.69f, -2.69f)
                lineToRelative(2.69f, 2.69f)
                horizontalLineToRelative(3.81f)
                verticalLineToRelative(3.81f)
                lineToRelative(2.69f, 2.69f)
                lineToRelative(-2.69f, 2.69f)
                verticalLineToRelative(3.81f)
                horizontalLineToRelative(-3.81f)
                lineToRelative(-2.69f, 2.69f)
                lineToRelative(-2.69f, -2.69f)
                horizontalLineToRelative(-3.81f)
                verticalLineToRelative(-3.81f)
                close()
            }
        }
        .build()
        return _sealExclamation!!
    }

private var _sealExclamation: ImageVector? = null
