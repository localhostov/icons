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

public val Icons.Outline.HatWitch: ImageVector
    get() {
        if (_hatWitch != null) {
            return _hatWitch!!
        }
        _hatWitch = Builder(name = "HatWitch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.323f, 22.0f)
                lineToRelative(-5.103f, -14.845f)
                lineToRelative(0.803f, -1.155f)
                horizontalLineToRelative(4.392f)
                reflectiveCurveToRelative(1.355f, -1.454f, 1.355f, -1.454f)
                lineTo(18.894f, 0.0f)
                horizontalLineToRelative(-6.128f)
                curveToRelative(-2.139f, 0.0f, -4.041f, 1.36f, -4.731f, 3.384f)
                lineTo(1.677f, 22.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.677f)
                close()
                moveTo(10.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(8.0f, 18.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.791f, 22.0f)
                lineTo(9.927f, 4.031f)
                curveToRelative(0.415f, -1.215f, 1.556f, -2.031f, 2.839f, -2.031f)
                horizontalLineToRelative(5.34f)
                lineToRelative(2.145f, 2.0f)
                horizontalLineToRelative(-3.273f)
                lineToRelative(-1.98f, 2.845f)
                lineToRelative(5.21f, 15.155f)
                horizontalLineToRelative(-4.207f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _hatWitch!!
    }

private var _hatWitch: ImageVector? = null
