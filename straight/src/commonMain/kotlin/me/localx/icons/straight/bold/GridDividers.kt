package me.localx.icons.straight.bold

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

public val Icons.Bold.GridDividers: ImageVector
    get() {
        if (_gridDividers != null) {
            return _gridDividers!!
        }
        _gridDividers = Builder(name = "GridDividers", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.0f)
                lineTo(0.0f, 3.0f)
                lineTo(0.0f, 0.0f)
                lineTo(24.0f, 0.0f)
                lineTo(24.0f, 3.0f)
                close()
                moveTo(24.0f, 13.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(3.0f)
                lineTo(24.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(6.0f, 5.0f)
                lineTo(0.0f, 5.0f)
                verticalLineToRelative(6.0f)
                lineTo(6.0f, 11.0f)
                lineTo(6.0f, 5.0f)
                close()
                moveTo(15.0f, 5.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 5.0f)
                close()
                moveTo(24.0f, 5.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                lineTo(24.0f, 5.0f)
                close()
                moveTo(6.0f, 18.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(6.0f)
                lineTo(6.0f, 24.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(15.0f, 18.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(24.0f, 18.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _gridDividers!!
    }

private var _gridDividers: ImageVector? = null
