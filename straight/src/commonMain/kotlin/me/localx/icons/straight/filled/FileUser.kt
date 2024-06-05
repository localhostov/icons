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

public val Icons.Filled.FileUser: ImageVector
    get() {
        if (_fileUser != null) {
            return _fileUser!!
        }
        _fileUser = Builder(name = "FileUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.026f, 7.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(15.026f, 0.0f)
                lineTo(5.026f, 0.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(3.974f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(6.026f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(22.026f, 7.0f)
                close()
                moveTo(12.026f, 17.0f)
                curveToRelative(-2.205f, 0.0f, -4.0f, -1.795f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.795f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.795f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.795f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(21.44f, 5.0f)
                horizontalLineToRelative(-4.414f)
                lineTo(17.026f, 0.586f)
                lineToRelative(4.414f, 4.414f)
                close()
                moveTo(14.026f, 13.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(16.026f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.026f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.026f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _fileUser!!
    }

private var _fileUser: ImageVector? = null
