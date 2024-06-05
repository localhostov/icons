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

public val Icons.Filled.FilePrescription: ImageVector
    get() {
        if (_filePrescription != null) {
            return _filePrescription!!
        }
        _filePrescription = Builder(name = "FilePrescription", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(22.0f, 7.0f)
                verticalLineToRelative(17.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(12.65f, 17.423f)
                lineToRelative(2.35f, -3.423f)
                horizontalLineToRelative(-2.255f)
                lineToRelative(-1.19f, 1.756f)
                lineToRelative(-1.33f, -2.024f)
                curveToRelative(1.044f, -0.47f, 1.775f, -1.515f, 1.775f, -2.732f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.131f)
                lineToRelative(2.29f, 3.429f)
                lineToRelative(-2.421f, 3.571f)
                horizontalLineToRelative(2.194f)
                lineToRelative(1.324f, -1.928f)
                lineToRelative(1.288f, 1.928f)
                horizontalLineToRelative(2.194f)
                lineToRelative(-2.35f, -3.577f)
                close()
                moveTo(17.0f, 0.586f)
                verticalLineToRelative(4.414f)
                horizontalLineToRelative(4.414f)
                lineTo(17.0f, 0.586f)
                close()
            }
        }
        .build()
        return _filePrescription!!
    }

private var _filePrescription: ImageVector? = null
