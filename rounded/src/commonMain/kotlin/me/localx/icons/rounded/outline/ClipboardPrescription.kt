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

public val Icons.Outline.ClipboardPrescription: ImageVector
    get() {
        if (_clipboardPrescription != null) {
            return _clipboardPrescription!!
        }
        _clipboardPrescription = Builder(name = "ClipboardPrescription", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 2.0f)
                horizontalLineToRelative(-0.171f)
                curveToRelative(-0.413f, -1.164f, -1.525f, -2.0f, -2.829f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.304f, 0.0f, -2.416f, 0.836f, -2.829f, 2.0f)
                horizontalLineToRelative(-0.171f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(21.0f, 7.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(19.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(8.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(5.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(16.581f, 13.186f)
                curveToRelative(-0.449f, -0.32f, -1.075f, -0.217f, -1.395f, 0.233f)
                lineToRelative(-0.972f, 1.36f)
                lineToRelative(-1.606f, -2.249f)
                curveToRelative(0.836f, -0.533f, 1.392f, -1.468f, 1.392f, -2.531f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.485f)
                lineToRelative(2.5f, 3.5f)
                lineToRelative(-1.371f, 1.919f)
                curveToRelative(-0.321f, 0.449f, -0.217f, 1.074f, 0.233f, 1.395f)
                curveToRelative(0.176f, 0.125f, 0.379f, 0.186f, 0.58f, 0.186f)
                curveToRelative(0.312f, 0.0f, 0.62f, -0.146f, 0.815f, -0.419f)
                lineToRelative(0.972f, -1.36f)
                lineToRelative(0.972f, 1.36f)
                curveToRelative(0.195f, 0.273f, 0.503f, 0.419f, 0.815f, 0.419f)
                curveToRelative(0.201f, 0.0f, 0.404f, -0.061f, 0.58f, -0.186f)
                curveToRelative(0.45f, -0.321f, 0.554f, -0.946f, 0.233f, -1.395f)
                lineToRelative(-1.371f, -1.919f)
                lineToRelative(1.371f, -1.919f)
                curveToRelative(0.321f, -0.449f, 0.217f, -1.074f, -0.233f, -1.395f)
                close()
                moveTo(9.0f, 10.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _clipboardPrescription!!
    }

private var _clipboardPrescription: ImageVector? = null
