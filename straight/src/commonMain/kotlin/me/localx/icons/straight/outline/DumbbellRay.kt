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

public val Icons.Outline.DumbbellRay: ImageVector
    get() {
        if (_dumbbellRay != null) {
            return _dumbbellRay!!
        }
        _dumbbellRay = Builder(name = "DumbbellRay", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(21.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(18.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(1.0f, 17.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 19.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 22.0f)
                lineTo(3.0f, 14.0f)
                lineTo(1.0f, 14.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(6.879f, 9.223f)
                curveToRelative(-0.366f, -0.493f, -0.474f, -1.114f, -0.296f, -1.702f)
                lineTo(9.18f, 0.0f)
                horizontalLineToRelative(6.471f)
                lineToRelative(-1.537f, 4.0f)
                horizontalLineToRelative(1.774f)
                curveToRelative(0.703f, 0.0f, 1.347f, 0.385f, 1.679f, 1.005f)
                curveToRelative(0.333f, 0.619f, 0.297f, 1.368f, -0.092f, 1.953f)
                lineToRelative(-5.117f, 7.042f)
                horizontalLineToRelative(-2.981f)
                lineToRelative(0.973f, -4.0f)
                horizontalLineToRelative(-1.927f)
                curveToRelative(-0.615f, 0.0f, -1.178f, -0.283f, -1.544f, -0.777f)
                close()
                moveTo(8.522f, 8.032f)
                lineToRelative(3.101f, -0.031f)
                horizontalLineToRelative(1.272f)
                lineToRelative(-0.68f, 2.796f)
                lineToRelative(3.522f, -4.845f)
                lineToRelative(-4.534f, 0.049f)
                lineToRelative(1.537f, -4.0f)
                horizontalLineToRelative(-2.135f)
                lineToRelative(-2.083f, 6.031f)
                close()
            }
        }
        .build()
        return _dumbbellRay!!
    }

private var _dumbbellRay: ImageVector? = null
